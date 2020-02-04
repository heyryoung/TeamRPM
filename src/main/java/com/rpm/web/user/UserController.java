package com.rpm.web.user;

import com.rpm.web.carbook.*;
import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired User user;
    @Autowired UserRepository userRepository;
    @Autowired
    Printer printer;
    @Autowired
    Carbook carbook;
    @Autowired
    CarbookRepository carbookRepository;
    @Autowired
    Record record;
    @Autowired
    CarbookService carbookService;
    @Autowired UserService userService;


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
        printer.accept("컨트롤러");
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
      //  printer.accept("in the userCon");
        //printer.accept(param.getUserid());
        HashMap<String, Object> map = new HashMap<>();
        user = userRepository.findByUseridAndPasswd(param.getUserid(), param.getPasswd());
        if (user != null) {
            printer.accept(param.getUserid());
            printer.accept(user.toString());

            map.put("user", user);

            map.put("token", user.getUserSeq());
            carbook = carbookRepository.findBySeq(user.getUserSeq());


            if(carbook!=null ){
                map.put("mycar", carbook);
                Object obj = carbook.getMycarId();
              /*  if(obj instanceof String){
                    printer.accept("Strig");
                }else if(obj instanceof Long){
                    printer.accept("long");
                }*/
                List<Record> records = carbookService.getRecords(carbook.getMycarId());



                if(records != null){
                    map.put("record", records);

                }
            }

            map.put("result", "success");

        } else {
            map.put("result", "fail");
        }
        // printer.accept(map.get("result"));
      //  printer.accept(map.get("user").toString());
         printer.accept(map.get("result"));
        printer.accept(param.toString());
        return map;
    }
    @PostMapping("/getUserInfo/{token}")
    public HashMap<String, Object> getUserInfo(@PathVariable String token){
        printer.accept("in the getuser");
        HashMap<String, Object> map = new HashMap<>();
        user = userRepository.findByUserSeq(Integer.parseInt(token));
        printer.accept(user.toString());
        if(user != null){
            map.put("result" , "success");
            map.put("user", user);

        }else{
            map.put("result", "fail");
        }
        return map;
    }
    @PostMapping("update")
    public HashMap<String, Object> update( @RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        map.put("user", userService.update(user));
        map.put("msg", "success");
        return map;
    }
    @GetMapping("withDrawl/{userid}")
    public String withDrawl(@PathVariable String userid){
        userService.withDrawl(userid);
        return "success";
    }

}
