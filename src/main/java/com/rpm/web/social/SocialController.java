package com.rpm.web.social;

import com.rpm.web.proxy.FileProxy;
import com.rpm.web.proxy.PageProxy;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class SocialController {
    @Autowired Printer printer;
    @Autowired SocialRepository socialRepository;
    @Autowired UserRepository userRepository;
    @Autowired SocialService socialService;
    @Autowired PageProxy pager;
    @Autowired FileProxy fileProxy;

    @GetMapping("/viewList/{pageNo}")
    public SocialListDto[] viewList(@PathVariable String pageNo){
        pager.setPageNum(Integer.parseInt(pageNo));
        pager.setPageSize(12);
        pager.paging(socialService.allList());
        int thisPageSize = (pager.getEndRow()+1)-((pager.getPageNum()-1)*pager.getPageSize());
        SocialListDto[] list = new SocialListDto[thisPageSize];
        for(int i=0; i<thisPageSize; i++){
            list[i]=socialService.allList().get(pager.getStartRow()+i);
        }
        printer.accept(pageNo+"페이지 로딩");
        return list;
    }

    @PostMapping("/uploadImg")
    public String uploadImg(MultipartHttpServletRequest uploadFile) {
        Iterator<String> itr =uploadFile.getFileNames();
        MultipartFile mfile = null;
        String filename = itr.next();
        System.out.println(filename);
        mfile = uploadFile.getFile(filename);
        String origName=mfile.getOriginalFilename();
        String path = "C:\\Users\\yejee\\IdeaProjects\\TeamRPM\\src\\main\\resources\\static\\img\\";
        File serverFile = new File(path +origName);
        try {
            mfile.transferTo(serverFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "uploadImg";
    }
    @PostMapping("/searchModel/{param}")//제조사->모델명 찾기
    public Map<String, Object> searchModel(@PathVariable String param){
        Map<String, Object> map = new HashMap<>();

        return map;
    }@PostMapping("/searchModelName/{param}")
    public Map<String, Object> searchModelName(@PathVariable String param){
        Map<String, Object> map = new HashMap<>();

        return map;
    }
    @PostMapping("/writeContent")
    public Map<String, Object> writeContent (@RequestBody SocialWriteDto param){
        Map<String, Object> map = new HashMap<>();
        System.out.println("1");
        printer.accept("들어옴");
        map.put("data", "success");
        return map;
    }
}
