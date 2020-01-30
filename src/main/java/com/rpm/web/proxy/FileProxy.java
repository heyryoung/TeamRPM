package com.rpm.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Component
public class FileProxy extends Proxy{
    @Autowired GenFile genFile;
    public void fileUpload(MultipartFile[] uploadFile) {
        String uploadFolder = "C:\\Users\\User\\git\\EGOV_HANRABONG\\src\\main\\webapp\\resources\\upload";
        File uploadPath = genFile.makeFile(uploadFolder,getFolder());
        if(uploadPath.exists() == false) {
            uploadPath.mkdirs();
        }
        for(MultipartFile m : uploadFile) {
            String fname= m.getOriginalFilename();
            String extension = fname.substring(fname.lastIndexOf(".")+1);
            fname = fname.substring(fname.lastIndexOf("\\")+1, fname.lastIndexOf("."));
            File saveFile = genFile.makeFile(uploadPath, fname+ UUID.randomUUID().toString() +"."+extension);
            try {
                m.transferTo(saveFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public String getFolder() {
        return currentDate().replace("-", File.separator);
    }
}
