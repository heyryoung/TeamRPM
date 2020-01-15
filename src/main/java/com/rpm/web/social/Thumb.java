package com.rpm.web.social;

import com.rpm.web.user.User;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Component @Lazy @Entity
@Data @ToString
@Getter @Setter(AccessLevel.PUBLIC)
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="THUMB")
public class Thumb {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "THUMBSEQ") @NotNull private Long thumbSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARDSEQ")
    private Social boardSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERSEQ")
    private User userSeq;

    @Builder
    private Thumb(long thumbSeq){
        Assert.hasText(String.valueOf(thumbSeq), "thumbSeq must not be empty");
        this.thumbSeq = thumbSeq;
    }
}
