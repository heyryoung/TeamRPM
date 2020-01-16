package com.rpm.web.contents;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Long> {


}
