package com.rpm.web.social;

import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.Printer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class SocialController {
    @Autowired
    Printer printer;
    @Autowired SocialRepository socialRepository;
    @Autowired UserRepository userRepository;
    @Autowired ModelMapper modelMapper;
    @Bean public ModelMapper modelMapper() {return new ModelMapper();}
    @GetMapping("/viewList")
    public Map<String, Object> webCrawling(){
        Map<String, Object> map = new HashMap<>();
        Iterable<Social> socials = socialRepository.findAll();
        List<Social> list = new ArrayList<>();
        for(Social s : socials){
            Social dto =  modelMapper.map(s, Social.class);
            list.add(dto);
        }
        map.put("data", "SUCCESS");
        map.put("board", list.stream().sorted(Comparator.comparing(Social::getBoardSeq)
        .reversed()).collect(Collectors.toList()));
        System.out.println("controller out");
        return map;
    }
    @PostMapping("/thumb")
    public Map<String, Object> thumb(@RequestParam String param){
        Map<String, Object> map = new HashMap<>();
        map.put("data", "SUCCESS");
        return map;
    }
}
