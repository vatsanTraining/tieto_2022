package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
