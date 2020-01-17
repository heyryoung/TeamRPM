package com.rpm.web.contents;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Long> {

    @Query(value="SELECT  * FROM car ", nativeQuery=true)
    public List<Cars> findCarWithPaging();


}
