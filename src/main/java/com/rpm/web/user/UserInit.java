package com.rpm.web.user;


import com.rpm.web.company.CompanyRepository;
import com.rpm.web.social.SocialInit;
import com.rpm.web.social.SocialRepository;
import com.rpm.web.util.UserDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import java.util.List;

@Order(1)
@Component
public class UserInit implements ApplicationRunner {
    private UserRepository userRepository;
    private CompanyRepository companyRepository;
    @Autowired
    SocialRepository socialRepository;
    @Autowired SocialInit socialInit;
    public UserInit(UserRepository userRepository,CompanyRepository companyRepository){

        this.userRepository= userRepository;
        this.companyRepository= companyRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UserDummy userDummy = new UserDummy();
       long count = userRepository.count();
        if(count == 0){
            List<String> code = companyRepository.findCenterCode();
            for(int i =0;  i<500; i++){
                userRepository.save(userDummy.makeUser());
            }
            code.forEach(el->{
                User user =new User();
                user.setUserid(el);
                user.setName(companyRepository.findCenterNameByCenterCode(el));
                user.setPasswd(el);
                user.setEmail(el+"@gmail.com");
                user.setAuth(1);
                user.setRegion(companyRepository.findRigionByCenterCode(el));
                userRepository.save(user);
            });
        }
        if(socialRepository.count()==0){
            socialInit.run(args);
        }
    }
}
