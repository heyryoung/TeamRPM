package com.rpm.web.recommendedCar;

import com.rpm.web.contents.Cars;
import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Entity
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
@Table(name = "recommendedCar")
public class RecommendedCar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RECOCAR_SEQ") @NotNull private Long recoCarSeq;
    @Column(name = "USERID") @NotNull private String userid;
    @Column(name = "CENTER_CODE", length = 3) @NotNull private String centerCode;

    @OneToOne
    @JoinColumn(name="cid")
    private Cars cars;
}
