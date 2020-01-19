package com.rpm.web.contents;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

@Component
public interface CarsService {
    public Map<String, List<Cars>> getCategoryByCarType(Iterable<Cars> cars);
    public Map<String, Map<String, Long>> getCategory1(Iterable<Cars> cars);

    List<Cars>  findAllByDistinct(List<Cars> carsList);

    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor);
    public Map<String, Long> getCategory2(String param);
    public Map<String, Long> getCategory3(String param);

    List<SearchDetailCondition> findByMakecdWithCount(List<Cars> carsList);

    List<SearchDetailCondition> findByMakecd(List<Cars> carsList);
    List<Cars> findCarWithFuleType(List<Cars> carsList);
    List<Cars> findCarWithCenterRegionCode(List<Cars> carsList);
    List<Cars> findAllCategory(List<Cars> carsList);

    List<Cars> findCarBySelectedCategory(List<Cars> carsList, String category);
    Collection<? extends Cars> findCarBySelectedMaker(List<Cars> carsList, String code);
    Collection<? extends Cars> findCarBySelectedFuelType(List<Cars> carsList, String code);
    Collection<? extends Cars> findCarBySelectedRegion(List<Cars> carsList, String code);
}
