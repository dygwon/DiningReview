package com.practice.diningreview.repositories;

import com.practice.diningreview.models.DiningReview;
import com.practice.diningreview.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findByZipcodeAndPeanutScoreIsNotNullOrEggScoreIsNotNullOrDairyScoreIsNotNullOrderByNameDesc(String zipcode);
}