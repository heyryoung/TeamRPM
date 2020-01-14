package com.rpm.web.contents;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsInit implements ApplicationRunner {
    private CarsRepository carsRepository;

    public CarsInit(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
