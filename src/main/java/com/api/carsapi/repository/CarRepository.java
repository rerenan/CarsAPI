package com.api.carsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.carsapi.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
