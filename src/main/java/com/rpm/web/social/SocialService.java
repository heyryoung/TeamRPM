package com.rpm.web.social;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public interface SocialService {
    List<SocialListDto> allList();
    String[] thumbed(String userid);
    SocialDetailDto loadBoard(String boardSeq);
    void writeContent(SocialWriteDto param);
    void updateContent(String boardSeq, SocialWriteDto socialWriteDto);
    void deleteContent(String boardSeq);
    void thumbUp(String boardSeq, String userid);
    void thumbDown(String boardSeq, String userid);
}
