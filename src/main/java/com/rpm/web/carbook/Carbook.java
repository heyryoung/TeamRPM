package com.rpm.web.carbook;

import com.rpm.web.user.User;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component @Lazy @Entity
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MYCAR")
public class Carbook implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MYCARID")  @NotNull  private Long mycarId;
    @Column(name = "BRAND")  @NotNull private String brand;
    @Column(name = "MODEL") @NotNull private String model;
    @Column(name = "YEAR")  @NotNull private String year;
    @Column(name = "MONTH")  @NotNull private String month;
    @Column(name = "DISTANCE")  @NotNull private String distance;
    @Column(name = "FUELTYPE") private String fuelType;


    @OneToOne
    @JoinColumn(name = "userSeq")
    private User userSeq;

/*    @OneToMany(mappedBy = "mycarId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Record> records = new ArrayList<>();*/






    @Builder
    public Carbook(String brand, String model, String year,
                   String month, String distance, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.month = month;
        this.distance = distance;
        this.fuelType = fuelType;

    }
}
