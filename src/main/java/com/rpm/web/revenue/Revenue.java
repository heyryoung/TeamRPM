package com.rpm.web.revenue;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Component
@Entity
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
@Table(name = "revenue")
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REVENUE_SEQ") @NotNull private Long revenueSeq;
    @Column(name = "CENTER_CODE", length = 3) @NotNull private String centerCode;
    @Column(name = "MONTH") @NotNull private String month;
    @Column(name = "EM_CODE") @NotNull private String emCode;
    @Column(name = "EM_REVENUE") @NotNull private int emRevenue;
}
