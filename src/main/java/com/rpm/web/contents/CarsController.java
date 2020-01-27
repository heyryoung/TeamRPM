package com.rpm.web.contents;

import com.rpm.web.proxy.Box;
import com.rpm.web.proxy.Trunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.function.Consumer;
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
    @Autowired
    StringMatch stringMatch;
    private List<Object> carModelList;
    private List<Object> carModelHangeulList;

    public CarsController() {
        this.carModelList = new ArrayList<>();
        this.carModelHangeulList = new ArrayList<>();
    }

    @GetMapping("/init")
    public Map<String, Object> init(){
        trunk.clear();
        carModelList.clear();
        carModelHangeulList.clear();
        cars = (List<Cars>) carsRepository.findAll();
        carModelList.addAll(cars.stream().collect(Collectors.groupingBy(Cars::getModelnmText
                , Collectors.counting())).keySet());
        carModelList.forEach(s-> carModelHangeulList.add(stringMatch.seperateHan(s.toString().replace(" ", ""))));
        System.out.println("carModelList :" + carModelList);
        System.out.println("carModelHangeulList :" + carModelHangeulList);
        cars.sort((a,b) -> a.getCid().compareTo(b.getCid()));
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
        System.out.println("inside getCategory");
        trunk.clear();
        cars = carsService.findAllByDistinct((List<Cars>) carsRepository.findAll());
        switch (column){
            case "CAR_TYPE":
                trunk.put(Arrays.asList("category", "count"),
                        Arrays.asList(carsService.getCategory1(carsRepository.findAll()).get(param).keySet(),
                                carsService.getCategory1(carsRepository.findAll()).get(param).values()));
                break;
            case "MAKENM" :
                trunk.put(Arrays.asList("category", "count", "modelList"),
                        Arrays.asList(carsService.getCategory2(param).keySet(),
                                carsService.getCategory2(param).values(),
                                carsService.findByModelNMCategory((List<Cars>) cars , param )));
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
        System.out.println( " inside searchWithCondition" );
        trunk.clear();
        cars = carsService.findAllByDistinct((List<Cars>) carsRepository.findAll());
        List<Cars> carsProcessingList = new ArrayList<>();
        List<SearchDetailCondition> categoryList = searchCondition.getCategoryList();
        List<SearchDetailCondition> modelList = searchCondition.getModelList();
        List<SearchDetailCondition> resultModelList = null;
        List<SearchDetailCondition> fuelTypeList = searchCondition.getFuelTypeList();
        List<SearchDetailCondition> regionList = searchCondition.getRegionList();



        if ( "minPrice".equals(String.valueOf(searchCondition.getMinPrice().getBigCategory()))) {
            carsProcessingList.addAll(
                    cars.stream().filter(car -> car.getPrice()
                            >= Integer.parseInt(searchCondition.getMinPrice().getCode()))
                            .collect(Collectors.toList()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }
        if ( "maxPrice".equals(String.valueOf(searchCondition.getMaxPrice().getBigCategory()))) {
            carsProcessingList.addAll(
                    cars.stream().filter( car ->  car.getPrice()
                            <= Integer.parseInt(searchCondition.getMaxPrice().getCode()))
                            .collect(Collectors.toList()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }
        if ( "minMilage".equals(String.valueOf(searchCondition.getMinMilage().getBigCategory())) ) {
            carsProcessingList.addAll(
                    cars.stream().filter( car ->  car.getMilage()
                            >= Integer.parseInt(searchCondition.getMinMilage().getCode()))
                            .collect(Collectors.toList()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }
        if ( "maxMilage".equals(String.valueOf(searchCondition.getMaxMilage().getBigCategory()))) {
            carsProcessingList.addAll(
                    cars.stream().filter( car ->  car.getMilage()
                            <= Integer.parseInt(searchCondition.getMaxMilage().getCode()))
                            .collect(Collectors.toList()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }

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
        if ( searchCondition.getMaker() != null ) {
            carsProcessingList.addAll(carsService.findCarBySelectedMaker(cars , searchCondition.getMaker()));
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
            trunk.put(Arrays.asList("modelList"),Arrays.asList(carsService.findByModelWithCount(cars,searchCondition.getMaker())));
        }
        if ( !modelList.isEmpty() ) {
            for (SearchDetailCondition model : modelList) {
                carsProcessingList.addAll(carsService.findCarBySelectedModelNM(cars , model.getName()));
            }
            cars.clear();
            cars.addAll(carsProcessingList);
            carsProcessingList.clear();
        }
        if( searchCondition.getModelText() != null && searchCondition.getModelText() != ""){
            carsProcessingList.clear();
            carsProcessingList.addAll(cars.stream().filter(s -> s.getModelnmText().equals(searchCondition.getModelText())).collect(Collectors.toList()));
            cars.clear();
            cars.addAll(carsProcessingList);
        }


        if(searchCondition.getOrderBySub()=="default"){
            cars.sort((a,b) -> a.getCid().compareTo(b.getCid()));
        } else {
            switch (searchCondition.getOrderBySub()) {
                case "priceASC":
                    cars.sort((a,b) -> (a.getPrice()).compareTo(b.getPrice()));
                    break;
                case "priceDESC":
                    cars.sort((a,b) -> b.getPrice().compareTo(a.getPrice()));
                    break;
                case "mileageASC":
                    cars.sort((a,b) -> a.getMilage().compareTo(b.getMilage()));
                    break;
                case "mileageDESC":
                    cars.sort((a,b) -> b.getMilage().compareTo(a.getMilage()));
                    break;
                case "beginyearASC":
                    cars.sort((a,b) -> a.getBeginYear().compareTo(b.getBeginYear()));
                    break;
                case "beginyearDESC":
                    cars.sort((a,b) -> b.getBeginYear().compareTo(a.getBeginYear()));
                    break;
            }
        }



        trunk.put(Arrays.asList("resultLength", "showCarList", "makerList") ,
                Arrays.asList(cars.size()
                        ,(cars.stream().limit(searchCondition.getPageLimit()).toArray().length>0&&cars.stream().limit(searchCondition.getPageLimit()).toArray().length<=searchCondition.getPageLimit())
                                ? cars.stream().limit(searchCondition.getPageLimit()).toArray()
                                : false
                        ,carsService.findByMakecdWithCount(cars)
                ));
        return trunk.get();
    }

    @GetMapping("/getshowcarlist/{startrow}/{endrow}")
    public Object getShowCarList(@PathVariable String startrow, @PathVariable String endrow){
        return cars.subList(Integer.parseInt(startrow),Integer.parseInt(endrow));
    }

    @GetMapping("/stringMatch/{searchWord}")
    public Map<String, Object> stringMatch(@PathVariable String searchWord){
        List<Object> result = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        Consumer<Object> c = new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                if(o.toString().contains(stringMatch.seperateHan(searchWord.replace(" ", "")))){
                    index.add(carModelHangeulList.indexOf(o));
                }
            }
        };
        carModelHangeulList.forEach(s-> c.accept(s));
        if(index.size()!=0) {
            for (int i : index) {
                result.add(carModelList.get(i));
            }
        }
        trunk.put(Arrays.asList("result"), Arrays.asList((result.size()>0)?result:false));
        return trunk.get();
    }

    @GetMapping("/findMaker/{modelText}")
    public Map<String, Object> findMaker(@PathVariable String modelText){
        trunk.clear();
        trunk.put(Arrays.asList("maker", "model"), Arrays.asList(
                carsService.findMakerAndModelByModelText(modelText).keySet()
                        .toString().replace("[", "").replace("]", ""),
                carsService.findMakerAndModelByModelText(modelText).get(
                        carsService.findMakerAndModelByModelText(modelText).keySet()
                                .toString().replace("[", "").replace("]", ""))
                        .keySet().toString().replace("[", "").replace("]", "")));
        return trunk.get();
    }

}