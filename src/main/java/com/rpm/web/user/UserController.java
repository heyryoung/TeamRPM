package com.rpm.web.user;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired private UserRepository userRepository;
    @Autowired private Printer printer;
    @Autowired private User user;

    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestBody User param){
        printer.accept("in the userCon");
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
