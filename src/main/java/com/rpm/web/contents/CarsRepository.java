package com.rpm.web.contents;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Long> {
    @Query(value="SELECT  1 AS cid , c.* FROM (SELECT DISTINCT categorycd ,categorynm FROM car  ORDER BY categorycd) c", nativeQuery=true)
    public List<Cars> findAllCategory();

    @Query(value="SELECT  * FROM car ", nativeQuery=true)
    public List<Cars> findCarWithPaging();

}
