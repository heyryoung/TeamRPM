package com.rpm.web.company;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Entity
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
@Table(name = "Company")
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull @Column(name = "CENTER_CODE", length = 3) private String centerCode;
    @Column(name = "CENTER_REGION", length = 10) private String centerRegion;
}
