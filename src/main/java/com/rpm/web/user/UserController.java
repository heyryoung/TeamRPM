package com.rpm.web.user;

import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired User user;
    @Autowired UserRepository userRepository;
    @Autowired
    Printer printer;

    @PostMapping("/idCheck")
    public HashMap<String, String> idCheck(@RequestBody User param){
        printer.accept("idCheck컨트롤러 들어옴");
        HashMap<String, String> map = new HashMap<>();
        if(userRepository.findByUserid(param.getUserid())==null){
            map.put("msg", "SUCCESS");
        }else{
            map.put("msg", "FAIL");
        }
        return map;
    }
    @PostMapping("/join")
    public HashMap<String, Object> join(@RequestBody User param){
        HashMap<String, Object> map = new HashMap<>();
        userRepository.save(param);
        if (user != null) {
            printer.accept("가입 성공");
            map.put("msg", "SUCCESS");
            map.put("user", user);
        } else {
            printer.accept("가입 실패");
            map.put("msg", "FAIL");
        }
        return map;
    }
    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestBody User param) {
        printer.accept("in the userCon");
        printer.accept(param.getUserid());
        HashMap<String, Object> map = new HashMap<>();
        user = userRepository.findByUseridAndPasswd(param.getUserid(), param.getPasswd());
        if (user != null) {
            map.put("result", "success");
            map.put("user", user);

        } else {
            map.put("result", "fail");
        }
         printer.accept(map.get("result"));
        printer.accept(param.toString());
        return map;

    }

}
