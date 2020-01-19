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
    Box box;
    @Autowired
    Trunk<Object> trunk;
    @Autowired
    CarsService carsService;
    @Autowired
    List<Cars> cars;


    @GetMapping("/init")
    public Map<String, Object> init(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = (List<Cars>) carsRepository.findAll();
        trunk.put(Arrays.asList("allCount","carSearchResults","makerList","fuelTypeList","regionList","categoryList"),Arrays.asList(String.valueOf(carsRepository.count())
                ,carsList.subList(0,15),carsService.findByMakecd(carsList),carsService.findCarWithFuleType(carsList)
                ,carsService.findCarWithCenterRegionCode(carsList),carsService.findAllCategory(carsList)));

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

    @RequestMapping("/searchWithCondition")
    public Map<String,Object> searchWithCondition(@RequestBody  SearchCondition searchCondition){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = (List<Cars>) carsService.findAllByDistinct(carsRepository.findAll());
        searchCondition.getCategoryList().stream().forEach( s -> {
            carsList.stream().filter(e-> s.getCode().equals(e.getCategorycd()));
        });
        map.put("carSearchResults" , carsList.subList(0,15));
        return map;
    }

    @RequestMapping("/search")
    public Map<String,Object> search(@RequestBody  SearchCondition searchCondition){
        Iterable<Cars> cars= carsRepository.findAll();
        switch (searchCondition.getFindKey()){
            case "conditionWithxandy" :
        }
        return trunk.get();
    }
}