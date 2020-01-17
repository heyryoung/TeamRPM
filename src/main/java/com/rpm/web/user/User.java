package com.rpm.web.user;

import com.rpm.web.social.Social;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component @Lazy @Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USERSEQ") @NotNull private Long userSeq;
    @Column(name = "USERID") @NotNull private String userid;
    @Column(name = "PASSWD") @NotNull private String passwd;
    @Column(name = "NAME") @NotNull private String name;
    @Column(name = "EMAIL") @NotNull private String email;
    @Column(name = "GENDER")  private String gender;
    @Column(name = "BIRTHMONTH")  private String birthMonth;
    @Column(name = "REGION")  private String region;

    @OneToMany(mappedBy = "userSeq",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Social> socials = new ArrayList<>();


    @Builder
    private User(String userid, String passwd, String name, String email,
                   String gender, String birthMonth, String region) {
        Assert.hasText(userid, "userid must not be empty");
        Assert.hasText(passwd, "passwd must not be empty");
        Assert.hasText(name, "name must not be empty");
        Assert.hasText(email, "email must not be empty");
        Assert.hasText(gender);
        Assert.hasText(birthMonth);
        Assert.hasText(region);
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.region = region;
    }

}
