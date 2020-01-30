package com.rpm.web.employee;

import com.rpm.web.contents.Cars;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> findByCenterName(String centerName);
    @Query(value = "SELECT distinct center_code FROM car", nativeQuery = true)
    public List<String> findCenterCode();
    @Query(value = "SELECT distinct center_code FROM employee WHERE em_code like ?", nativeQuery = true)
    public String findByEmCode(String emCode);
    @Query(value = "SELECT distinct em_code FROM employee", nativeQuery = true)
    public List<String> findEmCode();
}
