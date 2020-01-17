package com.rpm.web.contents;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    public List<Car> findByMakenm(String makenm);
    public List<Car> findByModelGrpNm(String modelGrpNm);

}
