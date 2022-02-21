package com.practice.diningreview.models;

import com.practice.diningreview.enums.ReviewStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.practice.diningreview.enums.ReviewStatus;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiningReview {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull private String reviewer;
    @NonNull private Long restaurantId;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    private String commentary;
    private ReviewStatus status;
}
