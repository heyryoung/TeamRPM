package com.rpm.web.social;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rpm.web.user.User;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component @Lazy @Entity
@ToString
@Getter @Setter(AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="COMMENT")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "commentSeq")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENTSEQ") @NotNull private Long commentSeq;
    @Column(name = "COMMENTDATE") @NotNull private String commentDate;
    @Column(name = "COMMENTDETAIL") @NotNull private String commentDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARDSEQ")
    @NotNull
    private Social boardSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERSEQ")
    @NotNull
    private User userSeq;

    @Builder
    private Comment(String commentDate, String commentDetail){
        Assert.hasText(commentDate, "commentDate must not be empty");
        Assert.hasText(commentDetail, "commentDetail must not be empty");
        this.commentDate = commentDate;
        this.commentDetail = commentDetail;
    }
}
