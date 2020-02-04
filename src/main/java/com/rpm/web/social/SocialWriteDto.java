package com.rpm.web.social;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SocialWriteDto {
    private String carCode;
    private String carName;
    private String boardContent;
    private String boardImgName;
    private String userid;
}
