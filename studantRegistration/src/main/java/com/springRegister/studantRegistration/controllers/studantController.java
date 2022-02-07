package com.springRegister.studantRegistration.controllers;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.springRegister.studantRegistration.studant.studant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studantController {
    

    @GetMapping
    public List<studant> hello() {
        return List.of(
            new studant(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
            )
        );
    }
}
