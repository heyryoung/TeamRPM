package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CarsController {
    @Autowired
    CarsRepository carsRepository;
    @Autowired
    Box box;
    @Autowired
    Trunk<Object> trunk;
    @Autowired
    CarsServiceImpl carsServiceImpl;

    @GetMapping("/init")
    public Map<String, Object> init(){
        trunk.put(Arrays.asList("allCount"),Arrays.asList(String.valueOf(carsRepository.count())));
        return trunk.get();
    }

    @RequestMapping("/searchInit")
    public Map<String,Object> searchConditionInit(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = (List<Cars>) carsRepository.findAll();

        map.put("carSearchResults",carsList.subList(0,15));
        map.put("makerList",carsServiceImpl.findByMakecd(carsList));
        map.put("fuelTypeList",carsServiceImpl.findCarWithFuleType(carsList));
        map.put("regionList",carsServiceImpl.findCarWithCenterRegionCode(carsList));
        map.put("categoryList",carsServiceImpl.findAllCategory(carsList));
        return map;
    }
    @RequestMapping("/searchWithCondition")
    public Map<String,Object> searchWithCondition(@RequestBody  SearchCondition searchCondition){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = (List<Cars>) carsRepository.findAll();
        System.out.println(searchCondition.getCategoryList().get(0).getName());

        searchCondition.getCategoryList().stream().forEach( s -> {
            carsList.stream().filter(e-> s.getCode().equals(e.getCategorycd()));
        });

        carsList.forEach( e -> System.out.println(e.getCategorynm()));
        map.put("carSearchResults",carsRepository.findCarWithPaging());
        map.put("makerList",carsRepository.findCarWithMakerCount().get(0));
        map.put("fuelTypeList",carsRepository.findCarWithFuleType().get(0));
        map.put("regionList",carsRepository.findCarWithCenterRegionCode().get(0));
        map.put("categoryList",carsRepository.findAllCategory().get(0));

        return map;
    }
}