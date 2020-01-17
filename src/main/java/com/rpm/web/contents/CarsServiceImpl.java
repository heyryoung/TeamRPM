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
public class CarsServiceImpl implements CarsService {
    @Autowired private CarsRepository carsRepository;

    @Override
    public Map<String, List<Cars>> getCategoryByCarType(Iterable<Cars> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .filter(distinctByKey(Cars::getMakenm))
                .collect(Collectors.groupingBy(Cars::getCarType));
    }

    @Override
    public Map<String, Map<String, Long>> getCategory1(Iterable<Cars> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getCarType,
                        Collectors.groupingBy(Cars::getMakenm,Collectors.counting())));
    }
    @Override
    public Map<String, Long> getCategory2(String param) {
        return StreamSupport.stream(carsRepository.findByMakenm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getModelGrpNm, Collectors.counting()));
    }
    @Override
    public Map<String, Long> getCategory3(String param) {
        return StreamSupport.stream(carsRepository.findByModelGrpNm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getModelnmText, Collectors.counting()));
    }

    @Override
    public List<Cars>  findAllByDistinct(Iterable<Cars> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .filter(distinctByKey(Cars::getCarcd))
                .collect(Collectors.toList());
    }



    @Override
    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    @Override
    public List<Cars> findByMakecd(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getMakecd))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findCarWithFuleType(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getFuelTyped))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findCarWithCenterRegionCode(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getCenterRegionCode))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findAllCategory(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getCategorycd))
                .collect(Collectors.toList());
    }
}
