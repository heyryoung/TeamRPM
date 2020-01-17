package com.rpm.web.user;

import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired private UserRepository userRepository;
    @Autowired private Printer printer;
    @Autowired private User user;

    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestBody User param){
        printer.accept("in the userCon");
        printer.accept(param.getUserid());
        HashMap<String, Object> map = new HashMap<>();
        user = userRepository.findByUseridAndPasswd(param.getUserid(), param.getPasswd());

        if(user != null){
            user.setPasswd("");
            map.put("result" , "success");
            map.put("data" , user);
            map.put("ac_token" , user.getUserSeq());



        }else{
            map.put("result" , "fail");
            map.put("data", null);

        }
        printer.accept(map.get("result"));
        return map;



    }
    @PostMapping("/getToken")
    public HashMap<String, Object> getToken(@RequestBody String token){
        printer.accept("in the gettoken");
        printer.accept(token);
        HashMap<String, Object> map = new HashMap<>();
        long t = Long.parseLong(token);
        user = userRepository.findByUserSeq(t);


        if(user != null){
            user.setPasswd("");
            map.put("result" , "success");
            map.put("data" , user);




        }else{
            map.put("result" , "fail");
            map.put("data", null);

        }
        printer.accept(map.get("result"));
        return map;



    }





}
