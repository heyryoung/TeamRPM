package com.rpm.web.contents;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

@Component
public interface CarService {
    public Map<String, List<Car>> getCategoryByCarType(Iterable<Car> cars);
    public Map<String, Map<String, Long>> getCategory1(Iterable<Car> cars);
    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor);
    public Map<String, Long> getCategory2(String param);
    public Map<String, Long> getCategory3(String param);

}
