package com.rpm.web.carbook;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name="MYCAR")
class Mycar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USRESEQ")
    private int userseq;
    @Column(name="CARCODE")
    private String carCode;

    @Column(name="YEAR")
    private String year;
    @Column(name="FUELTYPE")
    private String fuelType;
    @Column(name="DISTANCE")
    private String distance;
    @Column(name="REFUELSEQ")
    private String refuelSeq;
    @Column(name="SERVICELSEQ")
    private String serviceSeq;





}
