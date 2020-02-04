package com.rpm.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class UserServiceImpl implements UserService{
    @Autowired UserRepository userRepository;
    @Autowired User user;
    @Override
    public void withDrawl(String userid) {
        user = new User();
        user = userRepository.findByUserid(userid);
        userRepository.delete(user);
    }

    @Override
    public User update(User param) {
        User updateUser = new User();
        user= userRepository.findByUserid(param.getUserid());
        updateUser.setUserSeq(user.getUserSeq());
        updateUser.setUserid(user.getUserid());
        updateUser.setName(user.getName());
        updateUser.setPasswd(param.getPasswd());
        updateUser.setEmail(param.getEmail());
        updateUser.setBirthMonth((param.getBirthMonth()=="")?user.getBirthMonth():param.getBirthMonth());
        updateUser.setRegion((param.getRegion()=="")?user.getRegion():param.getRegion());
        updateUser.setGender((param.getGender()=="")?user.getGender():param.getGender());
        updateUser.setSocials(user.getSocials());
        userRepository.save(updateUser);
        return userRepository.findByUserSeq(updateUser.getUserSeq());
    }
}
