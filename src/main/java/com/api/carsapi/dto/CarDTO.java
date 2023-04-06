package com.api.carsapi.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record CarDTO(

        @NotNull @NotBlank String modelo,

        @NotNull @NotBlank String fabricante,

        @NotNull @Past Date dataFabricacao,

        @NotNull @Positive int valor,

        @NotNull int anoModelo) {

}
