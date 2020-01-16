package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CarsController {
    @Autowired
    CarsRepository carsRepository;
    @Autowired
    Box box;
    @Autowired
    Trunk<Object> trunk;

    @GetMapping("/welcome")
    public Map<String, Object> welcome(){
        trunk.put(Arrays.asList("allCount"),Arrays.asList(String.valueOf(carsRepository.count())));
        return trunk.get();
    }

    @RequestMapping("/sch")
    public Map<String,Object> searchConditionInit(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> pagedCarList = carsRepository.findCarWithPaging().subList(0,15);
/*        List<Cars> allCarResult = carsRepository.findAllCategory();
        List<SearchConditionNoDep> categoryList = allCarResult.stream()
                .map(SearchConditionNoDep::new)
                .collect(toList());
        SearchCondition searchCondition = new SearchCondition();*/

        System.out.println(pagedCarList.get(0).getCategorynm());
        map.put("car_search_results",pagedCarList);

        //return carsRepository.findAllCategory().stream().collect(Collectors.toMap(s->s.getCategorycd(),p->p.getCategorynm()));
        return map;
    }
}