package com.rpm.web.social;

import com.rpm.web.proxy.PageProxy;
import com.rpm.web.user.UserRepository;
import com.rpm.web.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class SocialController {
    @Autowired Printer printer;
    @Autowired SocialRepository socialRepository;
    @Autowired UserRepository userRepository;
    @Autowired SocialService socialService;
    @Autowired PageProxy pager;

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
        String filename = itr.next();
        System.out.println(filename);
        MultipartFile mfile = uploadFile.getFile(filename);
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
    @DeleteMapping("/uploadImg")
    public String uploadImg() {
        return "uploadImg";
    }

    @PostMapping("/writeContent")
    public String writeContent (@RequestBody SocialWriteDto param){
        socialService.writeContent(param);
        return "success";
    }

    @GetMapping("/loadBoard/{boardSeq}")
    public SocialDetailDto loadBoard(@PathVariable String boardSeq){
        return socialService.loadBoard(boardSeq);
    }

    @PostMapping("/updateContent/{boardSeq}")
    public String updateContent (@PathVariable String boardSeq, @RequestBody SocialWriteDto socialWriteDto){
        socialService.updateContent(boardSeq, socialWriteDto);
        return "success";
    }
    @GetMapping("/delateContent/{boardSeq}")
    public String delateContent(@PathVariable String boardSeq){
        socialService.delateContent(boardSeq);
        return "success";
    }
}
