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
    @Autowired
    List<Cars> cars;
    static private List<Cars> cartatic = null;


    @GetMapping("/init")
    public Map<String, Object> init(){
        List<Cars> carsList = (List<Cars>) carsRepository.findAll();
        cartatic = null;
        cartatic = carsList;

        trunk.put(Arrays.asList("allCount" ,"carSearchResults","makerList","fuelTypeList", "regionList","categoryList")
                ,Arrays.asList(String.valueOf(carsRepository.count())
                        ,cartatic.subList(0,15)
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
            case "makerList" :
                trunk.put(Arrays.asList("makerList"),
                        Arrays.asList(carsService.findByMakecdWithCount((List<Cars>) cars)));
                break;
            case "modelList" :
                trunk.put(Arrays.asList("modelList"),
                        Arrays.asList(carsService.findByModelWithCount((List<Cars>) cars , param )));
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
        List<SearchDetailCondition> modelList = searchCondition.getModelList();
        List<SearchDetailCondition> fuelTypeList = searchCondition.getFuelTypeList();
        List<SearchDetailCondition> regionList = searchCondition.getRegionList();



        if ( !categoryList.isEmpty()) {
            for (SearchDetailCondition category : categoryList) {
                carsProcessingList.addAll(carsService.findCarBySelectedCategory(carsList , category.getCode()));
            }
            carsList.clear();
            carsList.addAll(carsProcessingList);
            carsProcessingList.clear();
        }


        if ( !fuelTypeList.isEmpty() ) {
            for (SearchDetailCondition fuelType : fuelTypeList) {
                carsProcessingList.addAll(carsService.findCarBySelectedFuelType(carsList , fuelType.getCode()));
            }
            carsList.clear();
            carsList.addAll(carsProcessingList);
            carsProcessingList.clear();
        }

        if ( !regionList.isEmpty() ) {
            for (SearchDetailCondition region : regionList) {
                carsProcessingList.addAll(carsService.findCarBySelectedRegion(carsList , region.getCode()));
            }
            carsList.clear();
            carsList.addAll(carsProcessingList);
            carsProcessingList.clear();
        }



        if( searchCondition.getMaker() != "") {
            carsProcessingList.addAll(carsService.findCarBySelectedMaker(carsList , searchCondition.getMaker()));
            carsList.clear();
            carsList.addAll(carsProcessingList);
            carsProcessingList.clear();
            map.put("modelList",carsService.findByModelWithCount((List<Cars>) carsList ,searchCondition.getMaker()));
        }
        map.put("makerList",carsService.findByMakecdWithCount(carsList));


        if ( !modelList.isEmpty() ) {
            for (SearchDetailCondition model : modelList) {
                carsProcessingList.addAll(carsService.findCarBySelectedModel(carsList , model.getCode()));
            }
            carsList.clear();
            carsList.addAll(carsProcessingList);
            carsProcessingList.clear();
        }

        cartatic = null;
        cartatic = carsList;
        map.put("carSearchResults" , cartatic.stream().limit(15));
        map.put("makerList",carsService.findByMakecdWithCount(cartatic));
        return map;
    }

}