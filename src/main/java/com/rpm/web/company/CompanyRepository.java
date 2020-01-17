package com.rpm.web.company;

import com.rpm.web.contents.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Cars,Long> {
    public Cars findByCenterCode(String centerCode);
}
