package com.rpm.web.social;

import com.rpm.web.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SocialWriteDto {
    private String boardDate;
    private String carCode;
    private String carName;
    private String boardContent;
    private String boardImgName;
    private File boardImgFile;
    private User user;
}
