package com.rpm.web.user;

import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired private UserRepository userRepository;
    @Autowired private Printer printer;
    @Autowired private User user;

    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestBody User param){
        HashMap<String, Object> map = new HashMap<>();
        user = userRepository.findByUseridAndPasswd(param.getUserid(), param.getPasswd());
        if(user != null){
            map.put("isAuth" , "true");
            map.put("data" , user);

        }else{
            map.put("isAuth" ,"false");
            map.put("data", null);

        }
        return map;



    }





}
