package com.api.carsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.carsapi.dto.CarDTO;

@RestController
@RequestMapping

public class CarController {

    @PostMapping("/api/cars")
    public void create(@RequestBody CarDTO req) {
        System.out.println(req.anoModelo());
    }
}
