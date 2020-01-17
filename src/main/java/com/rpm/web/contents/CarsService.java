package com.rpm.web.contents;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

@Component
public interface CarsService {
    public Map<String, List<Cars>> findByMakenm();
    public List<Cars> findByMakecd();
    public Map<String, List<Cars>> getCategoryByCarType();

    List<Cars> findByMakecd(List<Cars> carsList);

    List<Cars> findCarWithFuleType(List<Cars> carsList);

    List<Cars> findCarWithCenterRegionCode(List<Cars> carsList);

    List<Cars> findAllCategory(List<Cars> carsList);

    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor);

}