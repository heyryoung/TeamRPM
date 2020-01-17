package com.rpm.web.contents;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Long> {
    public List<Cars> findByMakenm(String makenm);
    public List<Cars> findByModelGrpNm(String modelGrpNm);

}
