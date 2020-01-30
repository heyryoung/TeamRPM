package com.rpm.web.recommendedCar;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recommendedCar")
@CrossOrigin(origins = "http://localhost:8081")
public class ReCommendedCarController {
    @Autowired RecommendedCarRepository recommendedCarRepository;
    @Autowired CarsRepository carsRepository;
    @PostMapping("/recommendedCar")
    public void recommendedCar(@RequestBody Map<String,Object> send){
        List<String> list=(List<String>) send.get("carcodeList");
        list.forEach(el->{
            RecommendedCar recommendedCar= new RecommendedCar();
            recommendedCar.setCarcd(el);
            recommendedCar.setUserid(String.valueOf(send.get("userid")));
            recommendedCar.setCenterCode(String.valueOf(send.get("centercode")));
            recommendedCarRepository.save(recommendedCar);
        });



    }
    @GetMapping("/getRecommendedCar/{userid}")
    public List<Cars> getRecommendedCar(@PathVariable String userid){
        System.out.println(userid);
        List<Cars> list=new ArrayList<>();
        recommendedCarRepository.findByUserid(userid).forEach(el->{
           list.add(carsRepository.findByCarcd(el.getCarcd()));
        });


        return list;
    }
}
