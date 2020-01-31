package com.rpm.web.user;

import com.rpm.web.social.SocialInit;
import com.rpm.web.social.SocialRepository;
import com.rpm.web.util.UserDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class UserInit implements ApplicationRunner {
    private UserRepository userRepository;
    @Autowired
    SocialRepository socialRepository;
    @Autowired SocialInit socialInit;

    public UserInit(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UserDummy userDummy = new UserDummy();
       long count = userRepository.count();
        if(count == 0){
            for(int i =0;  i<500; i++){
                userRepository.save(userDummy.makeUser());
            }
        }
        if(socialRepository.count()==0){
            socialInit.run(args);
        }
    }
}
