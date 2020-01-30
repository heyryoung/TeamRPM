package com.rpm.web.social;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbRepository extends CrudRepository<Thumb, Long> {
}
