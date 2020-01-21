package com.rpm.web.social;

import com.rpm.web.util.Printer;
import com.rpm.web.util.SocialDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class SocialController {
    @Autowired
    Printer printer;
    @GetMapping("/crawling")
    public Map<String, Object> webCrawling(){
        Map<String, Object> map = new HashMap<>();
        map.put("data", "SUCCESS");
        return map;
    }
    @PostMapping("/thumb")
    public Map<String, Object> thumb(@RequestParam String pariam){
        Map<String, Object> map = new HashMap<>();
        map.put("data", "SUCCESS");
        return map;
    }
}
