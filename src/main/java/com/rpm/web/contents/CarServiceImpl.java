package com.rpm.web.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarServiceImpl implements CarService {
    @Autowired private CarRepository carRepository;

    @Override
    public Map<String, List<Car>> getCategoryByCarType(Iterable<Car> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .filter(distinctByKey(Car::getMakenm))
                .collect(Collectors.groupingBy(Car::getCarType));
    }

    @Override
    public Map<String, Map<String, Long>> getCategory1(Iterable<Car> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .collect(Collectors.groupingBy(Car::getCarType,
                        Collectors.groupingBy(Car::getMakenm,Collectors.counting())));
    }
    @Override
    public Map<String, Long> getCategory2(String param) {
        return StreamSupport.stream(carRepository.findByMakenm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Car::getModelGrpNm, Collectors.counting()));
    }
    @Override
    public Map<String, Long> getCategory3(String param) {
        return StreamSupport.stream(carRepository.findByModelGrpNm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Car::getModelnmText, Collectors.counting()));
    }




    @Override
    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
