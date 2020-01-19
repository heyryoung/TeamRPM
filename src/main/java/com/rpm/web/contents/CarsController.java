package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping("/init")
    public Map<String, Object> init(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = (List<Cars>) carsRepository.findAll();
        List<SearchDetailCondition> makecdWithCount = new ArrayList<SearchDetailCondition>();
        List<SearchDetailCondition> tmpMakecd = new ArrayList<SearchDetailCondition>();


        trunk.put(Arrays.asList("allCount" ,"carSearchResults","makerList","fuelTypeList", "regionList","categoryList")
                ,Arrays.asList(String.valueOf(carsRepository.count())
                        ,carsList.subList(0,15)
                        ,carsService.findByMakecdWithCount(carsList)
                        ,carsService.findCarWithFuleType(carsList)
                        ,carsService.findCarWithCenterRegionCode(carsList)
                        ,carsService.findAllCategory(carsList)
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
        Map<String, Object> map = new HashMap<String, Object>();
        List<Cars> carsList = carsService.findAllByDistinct((List<Cars>) carsRepository.findAll());
        List<Cars> carsProcessingList = new ArrayList<>();
        List<SearchDetailCondition> categoryList = searchCondition.getCategoryList();
        List<SearchDetailCondition> makerList = searchCondition.getMakerList();
        List<SearchDetailCondition> fuelTypeList = searchCondition.getFuelTypeList();
        List<SearchDetailCondition> regionList = searchCondition.getRegionList();

        if ( !categoryList.isEmpty()) {
            for (SearchDetailCondition category : categoryList) {
                carsProcessingList.addAll(carsService.findCarBySelectedCategory(carsList , category.getCode()));
            }
            System.out.println(carsProcessingList.size());
            carsList = carsProcessingList;
        }

        if ( !makerList.isEmpty() ) {
            for (SearchDetailCondition maker : makerList) {
                carsProcessingList.addAll(carsService.findCarBySelectedMaker(carsList , maker.getCode()));
            }
            System.out.println(carsProcessingList.toString());
            carsList = carsProcessingList;
        }

        if ( !fuelTypeList.isEmpty() ) {
            for (SearchDetailCondition fuelType : fuelTypeList) {
                carsProcessingList.addAll(carsService.findCarBySelectedFuelType(carsList , fuelType.getCode()));
            }
            System.out.println(carsProcessingList.toString());
            carsList = carsProcessingList;
        }

        if ( !regionList.isEmpty() ) {
            for (SearchDetailCondition region : regionList) {
                carsProcessingList.addAll(carsService.findCarBySelectedRegion(carsList , region.getCode()));
            }
            System.out.println(carsProcessingList.toString());
            carsList = carsProcessingList;
        }

        map.put("carSearchResults" , carsList.stream().limit(15));
        return map;
    }
}