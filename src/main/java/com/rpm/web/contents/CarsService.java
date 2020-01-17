package com.rpm.web.contents;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

@Component
public interface CarsService {
    public Map<String, List<Cars>> getCategoryByCarType(Iterable<Cars> cars);
    public Map<String, Map<String, Long>> getCategory1(Iterable<Cars> cars);

    List<Cars>  findAllByDistinct(Iterable<Cars> cars);

    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor);
    public Map<String, Long> getCategory2(String param);
    public Map<String, Long> getCategory3(String param);

}
