package com.rpm.web.recommend;

import com.rpm.web.employee.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendRepository extends CrudRepository<Recommend, Long> {

}
