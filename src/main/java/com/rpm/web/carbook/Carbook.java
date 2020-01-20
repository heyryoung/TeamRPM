package com.rpm.web.carbook;

import com.sun.javafx.beans.IDProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Entity
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
@Table(name = "MYCAR")
public class Carbook  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = 'MYCARID') private Long mycarId;



}
