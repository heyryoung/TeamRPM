package com.rpm.web.social;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.BoardDescend;
import com.rpm.web.util.SocialDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        /*
        SocialDummy socialDummy = new SocialDummy();
        Iterable<User> users = userRepository.findAll();
        List<User> seq = new ArrayList<>();
        for(User u : users){
            seq.add(u);
        }
        Iterable<Cars> cars = carsRepository.findAll();//더미데이터 넣은 후에 find.All() 모두 주석처리 바랍니다.
        List<String> carCd = new ArrayList<>();
        for(Cars c : cars){
            carCd.add(c.getCarcd());
        }
        long count= socialRepository.count();
        ArrayList<Social> socialsDummy = socialDummy.crawlingBoard(seq, carCd);

        if(count == 0){
            for(int i=0; i<350; i++) {
                for (Social s : socialsDummy) {
                    socialRepository.save(s);
                }
            }
        }*/





        //comment 더미데이터 (socialBoard 더미 들어가고 나서 실행)

        /*Iterable<Social> socials = socialRepository.findAll();
        List<Social> socialList = new ArrayList<>();
        for(Social s : socials){
            socialList.add(s);
        }
        BoardDescend boardDescend = new BoardDescend();
        Collections.sort(socialList, boardDescend);
        List<Social> commentedSocialList = new ArrayList<>();
        for(int i=0; i<20; i++){
            commentedSocialList.add(socialList.get(i));
        }
        long commentCount = commentRepository.count();
        ArrayList<Comment> commentDummy = socialDummy.crawlingComment(seq, commentedSocialList);
        if(commentCount==0){
            for(int i=0; i<6; i++){
                for(Comment c : commentDummy){
                    commentRepository.save(c);
                }
            }
        }
*/



        //Thumb 더미데이터(comment 들어간 후에 실행)
        
        /*long thumbCount = thumbRepository.count();
        ArrayList<Thumb> thumbDummy = socialDummy.makeThumbList(seq, commentedSocialList);
        if(thumbCount==0){
            for(int i = 0; i<1000; i++){
                for(Thumb t: thumbDummy) {
                    thumbRepository.save(t);
                }
            }
        }*/
    }
}
