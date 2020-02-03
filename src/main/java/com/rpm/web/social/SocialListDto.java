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
public class SocialListDto {
    private Long boardSeq;
    private String boardDate;
    private String carCode;
    private String carName;
    private String boardContent;
    private String boardImg;
    private String userName;
    //private int commentCount;
    private int thumbCount;

}
