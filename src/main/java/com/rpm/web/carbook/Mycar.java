package com.rpm.web.carbook;

import com.rpm.web.user.User;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "MYCAR")
public class Mycar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MYCARSEQ")
    @NotNull
    private long mycarSeq;
    @Column(name = "CARCODE")
    @NotNull
    private String carCode;
    @Column(name = "YEAR")
    @NotNull
    private String year;
    @Column(name = "FUELTYPE")
    @NotNull
    private String fuelType;
    @Column(name = "DISTANCE")
    @NotNull
    private String distance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userSeq")
    private User userSeq;
    @OneToOne
    @JoinColumn(name = "refuelSeq")
    private RefuelRecord refuelRecord;

    @OneToOne
    @JoinColumn(name = "serviceSeq")
    private ServiceRecord serviceRecord;


    @Builder
    public Mycar(String year, String fuelType, String distance) {
        this.year = year;
        this.fuelType = fuelType;
        this.distance = distance;

    }
}