package com.rpm.web.social;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rpm.web.user.User;
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
@Getter @Setter
@NoArgsConstructor
@Table(name="SOCIALBOARD")
public class Social implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARDSEQ") @NotNull private long boardSeq;
    @Column(name = "BOARDDATE") @NotNull private String boardDate;
    @Column(name = "CARCODE") @NotNull private String carCode;
    @Column(name = "BOARDCONTENT", length = 5000) @NotNull private String boardContent;
    @Column(name = "BOARDIMG") @NotNull private String boardImg;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERSEQ")
    public User userSeq;

    @OneToMany(mappedBy = "boardSeq", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "boardSeq", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Thumb> thumbs = new ArrayList<>();

     /*@OneToMany(fetch = FetchType.EAGER,
             cascade = CascadeType.ALL)
     @JoinColumn(name = "BOARDSEQ")
     private List<Comment> comments = new ArrayList<>();

     @OneToMany(fetch = FetchType.EAGER,
             cascade = CascadeType.ALL)
     @JoinColumn(name = "BOARDSEQ")
     private List<Thumb> thumbs = new ArrayList<>();
*/
    @Builder
    private Social(String boardDate, String carCode, String boardContent, String boardImg) {
        Assert.hasText(boardDate, "boardDate must not be empty");
        Assert.hasText(carCode, "carCode must not be empty");
        Assert.hasText(boardContent, "boardContent must not be empty");
        Assert.hasText(boardImg, "boardImg must not be empty");
        this.boardDate = boardDate;
        this.carCode = carCode;
        this.boardContent = boardContent;
        this.boardImg = boardImg;
    }
}
