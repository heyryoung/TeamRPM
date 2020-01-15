package com.rpm.web.social;

import com.rpm.web.user.User;
import com.sun.javafx.beans.IDProperty;
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
@Data @ToString
@Getter @Setter(AccessLevel.PUBLIC)
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="SOCIALBOARD")

public class Social implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARDSEQ") @NotNull private long boardSeq;
    @Temporal(TemporalType.DATE)
    @Column(name = "BOARDDATE") private String boardDate;
    @Column(name = "CARCODE") private String carCode;
    @Column(name = "BOARDCONTENT") private String boardContent;
    @Column(name = "BOARDIMG") private String boardImg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERSEQ") private User userSeq;

    @OneToMany(mappedBy = "COMMENTSEQ", cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Comment> commnets = new ArrayList<>();

    @Builder
    private Social(long boardSeq, String boardDate, String carCode, String boardContent, String boardImg) {
        Assert.hasText(String.valueOf(boardSeq), "boardSeq must not be empty");
        Assert.hasText(boardDate, "boardDate must not be empty");
        Assert.hasText(carCode, "carCode must not be empty");
        Assert.hasText(boardContent, "boardContent must not be empty");
        Assert.hasText(boardImg, "boardImg must not be empty");
        this.boardSeq = boardSeq;
        this.boardDate = boardDate;
        this.carCode = carCode;
        this.boardContent = boardContent;
        this.boardImg = boardImg;
    }
}
