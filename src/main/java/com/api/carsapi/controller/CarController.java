package com.api.carsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.carsapi.dto.CarDTO;
import com.api.carsapi.repository.CarRepository;
import com.api.carsapi.model.Car;

@RestController
@RequestMapping

public class CarController {

    @Autowired
    private CarRepository repository;

    @PostMapping("/api/cars")
    public void create(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
}
