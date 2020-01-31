package com.rpm.web.social;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public interface SocialService {
    List<SocialListDto> allList();
    SocialDetailDto loadBoard(String boardSeq);
    void writeContent(SocialWriteDto param);
    void updateContent(String boardSeq, SocialWriteDto socialWriteDto);
    void delateContent(String boardSeq);
}
