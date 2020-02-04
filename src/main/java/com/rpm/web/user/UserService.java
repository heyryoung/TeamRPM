package com.rpm.web.user;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Lazy
public interface UserService{
    void withDrawl(String userid);
    User update(User user);
}
