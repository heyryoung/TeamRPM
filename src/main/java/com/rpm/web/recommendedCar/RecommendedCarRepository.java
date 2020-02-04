package com.rpm.web.recommendedCar;

import com.rpm.web.recommend.Recommend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecommendedCarRepository extends CrudRepository<RecommendedCar, Long> {

    List<RecommendedCar> findByUserid(String userid);

}
