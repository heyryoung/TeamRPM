package com.rpm.web.contents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SearchConditioinWithDep {
    private boolean checked = false;
    private String upperCode , upperName, code, name;

    private String carcd;
    private String categorycd;
    private String centerCode;
    private String centerRegion;
    private String beginYear;
    private String makecd;
    private String modelnm;
    private String carType;
    private String milage;
    private String price;
    private String fuleTypedName;
    private String fuelTyped;
    private String centerRegionCode;
    private String categorynm;
    private String modelcd;
    private String makenm;
    private String mfrDate;
    private String modelGrpCd;
    private String centerName;
    private String modelGrpNm;


    public SearchConditioinWithDep(Cars cars) {
        if(cars.getCategorycd() != null){
            categorycd = cars.getCategorycd();
            categorynm = cars.getCategorynm();
        }

    }
}
