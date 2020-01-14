package com.rpm.web.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {
    @Autowired CarsRepository carsRepository;

    @RequestMapping("/")
    public String index(){
        Iterable<Cars> all = carsRepository.findAll();
        StringBuilder sb = new StringBuilder();
        all.forEach(p -> sb.append(p+" "));
        return sb.toString();
    }
}