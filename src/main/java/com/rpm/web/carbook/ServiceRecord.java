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
@Table(name = "SERVICERECORD")
public class ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SERVESEQ")
    private long servSeq;
    @Column(name = "SERVDATE")
    private String servDate;
    @Column(name = "SERVCODE")
    private String servCode;
    @Column(name = "SERVDETAIL")
    private String servDetail;
    @Column(name = "SERVPRICE")
    private String servPrice;

}
