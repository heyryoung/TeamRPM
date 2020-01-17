package com.rpm.web.contents;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
public class SearchDetailCondition {
    private boolean checked;
    private String code,name;

}
