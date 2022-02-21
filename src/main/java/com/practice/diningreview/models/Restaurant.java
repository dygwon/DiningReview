package com.practice.diningreview.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "NAME", "ZIPCODE" }) })
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="NAME")
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    @Column(name="ZIPCODE")
    private String zipcode;
    private String foodType;
    private Float rating;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;

    public Restaurant() {}

    public Restaurant(String name,
                      String streetAddress,
                      String city,
                      String state,
                      String zipcode,
                      String foodType,
                      Float rating,
                      Integer peanutScore,
                      Integer eggScore,
                      Integer dairyScore) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.foodType = foodType;
        this.rating = rating;
        this.peanutScore = peanutScore;
        this.eggScore = eggScore;
        this.dairyScore = dairyScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getPeanutScore() {
        return peanutScore;
    }

    public void setPeanutScore(Integer peanutScore) {
        this.peanutScore = peanutScore;
    }

    public Integer getEggScore() {
        return eggScore;
    }

    public void setEggScore(Integer eggScore) {
        this.eggScore = eggScore;
    }

    public Integer getDairyScore() {
        return dairyScore;
    }

    public void setDairyScore(Integer dairyScore) {
        this.dairyScore = dairyScore;
    }
}
