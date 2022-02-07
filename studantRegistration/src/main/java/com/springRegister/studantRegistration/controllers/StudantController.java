package com.springRegister.studantRegistration.controllers;

import java.util.List;

import com.springRegister.studantRegistration.Service.StudantService;
import com.springRegister.studantRegistration.studant.Studant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/studant")
public class StudantController {

    private final StudantService studantService;

    @Autowired
    public StudantController(StudantService studantService) {
        this.studantService = studantService;
    }

    @GetMapping
    public List<Studant> getStudants() {
        
        return studantService.getStudants();
    }
}
