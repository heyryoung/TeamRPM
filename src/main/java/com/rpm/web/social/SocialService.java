package com.rpm.web.social;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public interface SocialService {
    public List<SocialListDto> allList();
}
