package com.rpm.web.social;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.SocialDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Order(4)
@Component
public class SocialInit implements ApplicationRunner {
    private SocialRepository socialRepository;
    public SocialInit(SocialRepository socialRepository) {
        this.socialRepository = socialRepository;
    }

    @Autowired
    UserRepository userRepository;
    @Autowired
    CarsRepository carsRepository;
    @Autowired
    ThumbRepository thumbRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        SimpleDateFormat SystemTime = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String formattedTime1 = SystemTime.format (System.currentTimeMillis());

        System.out.println( formattedTime1 + "  INFO 18844 --- [           SocialInit ]         : SocialInit Start ");

        if (userRepository.count() != 0 && carsRepository.count() != 0) {
            //socialBoard 테이블을 지운 후 social더미만 먼저 실행

            SocialDummy socialDummy = new SocialDummy();
            Iterable<User> users = userRepository.findAll();
            List<User> user = new ArrayList<>();
            for (User u : users) {
                user.add(u);
            }
            Iterable<Cars> cars = carsRepository.findAll();
            List<Cars> car = new ArrayList<>();
            for (Cars c : cars) {
                car.add(c);
            }
            long count = socialRepository.count();
            if (count == 0) {
                System.out.println("socialboard 등록 시작");
                for (int i = 0; i < 10; i++) {
                    for (Social s : socialDummy.crawlingBoard(user, car)) {
                        socialRepository.save(s);
                    }
                }
                System.out.println("socialboard 등록 완료");
            }
            //comment/ thumb 넣을 board 정렬
            Iterable<Social> socials = socialRepository.findAll();
            List<Social> socialList = new ArrayList<>();
            for (Social s : socials) {
                socialList.add(s);
            }
            socialList.stream().sorted(Comparator.comparing(Social::getBoardSeq)).collect(Collectors.toList());
            List<Social> commentedSocialList = new ArrayList<>();
            commentedSocialList.clear();
            for (int i = socialList.size() - 1; i > socialList.size() - 30; i--) {
                commentedSocialList.add(socialList.get(i));
            }



            /*Comment Dummy Data

            long commentCount = commentRepository.count();
            if (commentCount == 0) {
                System.out.println("comment 등록 시작");
                for (int i = 0; i < 6; i++) {
                    for (Comment c : socialDummy.crawlingComment(user, commentedSocialList)) {
                        commentRepository.save(c);
                    }
                }
                System.out.println("comment 등록 완료");
            }*/


            //Thumb 더미데이터

            long thumbCount = thumbRepository.count();
            if (thumbCount == 0) {
                System.out.println("thumb 등록 시작");
                Collections.shuffle(user);
                List<User> thumbUserList = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    thumbUserList.add(user.get(i));
                }
                for (User u : thumbUserList) {
                    Collections.shuffle(commentedSocialList);
                    for (int i = 0; i < 20; i++) {
                        Thumb thumb = new Thumb();
                        thumb.setUserSeq(u);
                        thumb.setBoardSeq(commentedSocialList.get(i));
                        thumbRepository.save(thumb);
                    }
                }
                System.out.println("thumb 등록 완료");
            }
        }
        System.out.println( formattedTime1 + "  INFO 18844 --- [           SocialInit ]         : SocialInit End ");
    }
}



