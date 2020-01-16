package com.rpm.web.carbook;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "REFUELRECORD")
public class RefuelRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REFUELSEQ")
    private long refuelSeq;
    @Column(name = "REFUELDATE")
    private String refuelDate;
    @Column(name = "REFUELQUANTITY")
    private String refuelQuantity;
    @Column(name = "REFUELPRICE")
    private String refuelPrice;



}
