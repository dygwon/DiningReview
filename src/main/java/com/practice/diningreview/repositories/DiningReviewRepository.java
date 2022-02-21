package com.practice.diningreview.repositories;

import java.util.List;

import com.practice.diningreview.models.DiningReview;
import com.practice.diningreview.enums.ReviewStatus;
import org.springframework.data.repository.CrudRepository;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<DiningReview> findByStatusIs(ReviewStatus status);
    List<DiningReview> findByRestaurantId(Long restaurantId);
}