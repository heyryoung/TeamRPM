package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

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
        trunk.clear();
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
        trunk.clear();
        cars = carsService.findAllByDistinct((List<Cars>) carsRepository.findAll());
        List<Cars> carsProcessingList = new ArrayList<>();
        List<SearchDetailCondition> categoryList = searchCondition.getCategoryList();
        List<SearchDetailCondition> modelList = searchCondition.getModelList();
        List<SearchDetailCondition> resultModelList = null;
        List<SearchDetailCondition> fuelTypeList = searchCondition.getFuelTypeList();
        List<SearchDetailCondition> regionList = searchCondition.getRegionList();



        if ( !categoryList.isEmpty()) {
            for (SearchDetailCondition category : categoryList) {
                carsProcessingList.addAll(carsService.findCarBySelectedCategory(cars , category.getCode()));
            }
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }


        if ( !fuelTypeList.isEmpty() ) {
            for (SearchDetailCondition fuelType : fuelTypeList) {
                carsProcessingList.addAll(carsService.findCarBySelectedFuelType(cars , fuelType.getCode()));
            }
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }

        if ( !regionList.isEmpty() ) {
            for (SearchDetailCondition region : regionList) {
                carsProcessingList.addAll(carsService.findCarBySelectedRegion(cars , region.getCode()));
            }
            cars = carsProcessingList;
        }

        if ( !searchCondition.getMaker().equals("") ) {
            carsProcessingList.addAll(carsService.findCarBySelectedMaker(cars , searchCondition.getMaker()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
            trunk.put(Arrays.asList("modelList"),Arrays.asList(carsService.findByModelWithCount(cars,searchCondition.getMaker())));
            //resultModelList = carsService.findByModelWithCount(cars,searchCondition.getMaker());
        }

        if ( !modelList.isEmpty() ) {
            for (SearchDetailCondition model : modelList) {
                carsProcessingList.addAll(carsService.findCarBySelectedModel(cars , model.getCode()));
            }
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }


        cars.stream().toArray();

        trunk.put(Arrays.asList("resultLength", "showCarList", "makerList","pageLimit" ) ,
                Arrays.asList(cars.size()
                        ,(cars.size()>0&&cars.subList(0, searchCondition.getPageLimit()).size()<=searchCondition.getPageLimit())
                                ? cars.subList(0, searchCondition.getPageLimit())
                                : false
                        ,carsService.findByMakecdWithCount(cars)
                        ,(searchCondition.getPageLimit()!=0)?searchCondition.getPageLimit():15
                        ));
        return trunk.get();
    }
  
    @GetMapping("/getshowcarlist/{startrow}/{endrow}")
    public Object getShowCarList(@PathVariable String startrow, @PathVariable String endrow){
        return cars.subList(Integer.parseInt(startrow),Integer.parseInt(endrow));
        }

}