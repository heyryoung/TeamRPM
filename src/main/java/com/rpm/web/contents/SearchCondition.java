package com.rpm.web.contents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SearchCondition {

    public List<SearchConditioinWithDep> maker;
    public List<SearchConditionNoDep> category;
    public List<SearchConditionNoDep> fuelType;
    public List<SearchConditioinWithDep> centerRegion;

}
