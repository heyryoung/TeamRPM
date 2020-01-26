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
@Table(name = "employee")
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull @Column(name = "EM_CODE") private int emCode;
    @Column(name = "MONTH_REVENUE") private int monthRevenue;
    @Column(name = "CENTER_NAME", length = 20) private String centerName;
    @Column(name = "CENTER_CODE", length = 3) private String centerCode;
    @Column(name = "EM_POSITION", length = 3) private String emPosition;
    @Column(name = "EM_ROLE", length = 3) private String emRole;
    @Column(name = "CARCD", length = 12) private String carcd;

}
