package com.rpm.web.social;

import com.rpm.web.user.User;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component @Lazy @Entity
@Data @ToString
@Getter @Setter(AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Table(name="COMMENT")
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENTSEQ") @NotNull private Long commentSeq;
    @Temporal(TemporalType.DATE)
    @Column(name = "COMMENTDATE") @NotNull private String commentDate;
    @Column(name = "COMMENTDETAIL") @NotNull private String commentDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARDSEQ")
    private Social boardSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERSEQ")
    private User userSeq;

    @Builder
    private Comment(long commnetseq, String commentDate, String commentDetail){
        Assert.hasText(String.valueOf(commentSeq), "commentSeq must not be empty");
        Assert.hasText(commentDate, "commentDate must not be empty");
        Assert.hasText(commentDetail, "commentDetail must not be empty");
        this.commentSeq = commnetseq;
        this.commentDate = commentDate;
        this.commentDetail = commentDetail;
    }
}
