package com.rpm.web.magazine;

import com.rpm.web.proxy.FileProxy;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/chart")
public class ChartMakerController {
    FileProxy filemgr;
    @Autowired
    Trunk<String> trunk;


    @RequestMapping("/chartSave")
    public Map< String , String  >  chartMaker (@RequestParam("uploadFile") MultipartFile[] uploadFile) {
        Map< String , String  > map = new HashMap<>();
        System.out.println(uploadFile.length);
        filemgr = new FileProxy();
        filemgr.fileupload(uploadFile);
        System.out.println(uploadFile.toString());
        map.put("result","SUCCESS");
        return map;
    }

    @RequestMapping("/chartReader/{fileName}")
    public Map < String , Object > chartReader (@PathVariable String fileName) {

        ChartReader chartReader = new ChartReader();

        return chartReader.fileReader(fileName);
    }
}
