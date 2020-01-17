package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CarsController {
    @Autowired
    CarsRepository carsRepository;
    @Autowired
    CarsServiceImpl carsServiceImpl;
    @Autowired
    Box box;
    @Autowired
    Trunk<Object> trunk;
    @Autowired
    CarsService carsService;


    @GetMapping("/welcome")
    public Map<String, Object> welcome(){
        trunk.put(Arrays.asList("allCount"),Arrays.asList(String.valueOf(carsRepository.count())));
        return trunk.get();
    }

    @GetMapping("/getcategory/{param}/{column}")
    public Map<String, Object> getCategory(@PathVariable String param, @PathVariable String column){
        Iterable<Cars> cars= carsRepository.findAll();
        System.out.println(param);
        System.out.println(column);
        switch (column){
            case "CAR_TYPE":
                trunk.put(Arrays.asList("category", "count"),
                        Arrays.asList(carsService.getCategory1(cars).get(param).keySet(),
                                carsService.getCategory1(cars).get(param).values()));
                break;
            case "MAKENM" :
                trunk.put(Arrays.asList("category", "count"),
                        Arrays.asList(carsService.getCategory2(param).keySet(),
                                carsService.getCategory2(param).values()));
                break;
            case "MODEL_GRP_NM" :
                trunk.put(Arrays.asList("category", "count"),
                        Arrays.asList(carsService.getCategory3(param).keySet(),
                                carsService.getCategory3(param).values()));
                break;
        }
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

        map.put("result" , carsList);
        return map;
    }
}