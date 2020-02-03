package com.rpm.web.social;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.SocialDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SocialInit implements ApplicationRunner {
    private SocialRepository socialRepository;
    public SocialInit(SocialRepository socialRepository){ this.socialRepository = socialRepository;}
    @Autowired UserRepository userRepository;
    @Autowired CarsRepository carsRepository;
    @Autowired CommentRepository commentRepository;
    @Autowired ThumbRepository thumbRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //socialBoard 테이블을 지운 후 social더미만 먼저 실행
        //index관련 에러날 수 있음.

        if(userRepository.count()==0) return;
        SocialDummy socialDummy = new SocialDummy();
        Iterable<User> users = userRepository.findAll();
        List<User> user = new ArrayList<>();
        for(User u : users){
            user.add(u);
        }
        Iterable<Cars> cars = carsRepository.findAll();
        List<Cars> car = new ArrayList<>();
        for(Cars c : cars){
            car.add(c);
        }
        long count= socialRepository.count();
        if(count == 0 && userRepository.count() !=0){
            System.out.println("socialboard 등록 시작");
            for(int i=0; i<30; i++) {
                for (Social s : socialDummy.crawlingBoard(user, car)) {
                    socialRepository.save(s);
                }
            }
            System.out.println("socialboard 등록 완료");
        }





        //comment 더미데이터

        Iterable<Social> socials = socialRepository.findAll();
        List<Social> socialList = new ArrayList<>();
        for(Social s : socials){
            socialList.add(s);
        }
        socialList.stream().sorted(Comparator.comparing(Social::getBoardSeq)).collect(Collectors.toList());
        List<Social> commentedSocialList = new ArrayList<>();
        commentedSocialList.clear();
        for(int i=socialList.size()-1; i>socialList.size()-8 ; i--){
            commentedSocialList.add(socialList.get(i));
        }


        //Thumb 더미데이터

        long thumbCount = thumbRepository.count();
        if(thumbCount==0){
            System.out.println("thumb 등록 시작");
            for(int i = 0; i<500; i++){
                thumbRepository.save(socialDummy.makeThumbList(user, commentedSocialList));
            }
            System.out.println("thumb 등록 완료");
        }
    }
}
