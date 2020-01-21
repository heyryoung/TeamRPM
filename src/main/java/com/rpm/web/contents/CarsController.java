package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.function.Predicate;
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
        cars = (List<Cars>) carsRepository.findAll();
        trunk.put(Arrays.asList("allCount" ,"carInitList","makerList","fuelTypeList", "regionList","categoryList")
                ,Arrays.asList(String.valueOf(carsRepository.count())
                        ,cars.subList(0,15)
                        ,carsService.findByMakecdWithCount(cars)
                        ,carsService.findCarWithFuleType(cars)
                        ,carsService.findCarWithCenterRegionCode(cars)
                        ,carsService.findAllCategory(cars)
                ));

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
        cars = carsService.findAllByDistinct((List<Cars>) carsRepository.findAll());
        List<Cars> carsProcessingList = new ArrayList<>();
        List<SearchDetailCondition> categoryList = searchCondition.getCategoryList();
        List<SearchDetailCondition> makerList = searchCondition.getMakerList();
        List<SearchDetailCondition> fuelTypeList = searchCondition.getFuelTypeList();
        List<SearchDetailCondition> regionList = searchCondition.getRegionList();

        if ( !categoryList.isEmpty()) {
            for (SearchDetailCondition category : categoryList) {
                carsProcessingList.addAll(carsService.findCarBySelectedCategory(cars , category.getCode()));
            }
            cars = carsProcessingList;
        }

        if ( !makerList.isEmpty() ) {
            for (SearchDetailCondition maker : makerList) {
                carsProcessingList.addAll(carsService.findCarBySelectedMaker(cars , maker.getCode()));
            }
            cars = carsProcessingList;
        }

        if ( !fuelTypeList.isEmpty() ) {
            for (SearchDetailCondition fuelType : fuelTypeList) {
                carsProcessingList.addAll(carsService.findCarBySelectedFuelType(cars , fuelType.getCode()));
            }
            cars = carsProcessingList;
        }

        if ( !regionList.isEmpty() ) {
            for (SearchDetailCondition region : regionList) {
                carsProcessingList.addAll(carsService.findCarBySelectedRegion(cars , region.getCode()));
            }
            cars = carsProcessingList;
        }
        trunk.put(Arrays.asList("resultLength", "showCarList") , Arrays.asList(cars.size(), cars.subList(0,15)));
        return trunk.get();
    }
    @GetMapping("/getshowcarlist/{startrow}/{endrow}")
    public Object getShowCarList(@PathVariable String startrow, @PathVariable String endrow, Model model){
        return (cars.subList(Integer.parseInt(startrow),Integer.parseInt(endrow))!=null)
                ?cars.subList(Integer.parseInt(startrow),Integer.parseInt(endrow))
                :false;
    }

}