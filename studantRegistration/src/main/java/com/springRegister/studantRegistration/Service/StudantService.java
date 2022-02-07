package com.springRegister.studantRegistration.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.springRegister.studantRegistration.studant.Studant;

import org.springframework.stereotype.Service;

@Service
public class StudantService {
    
    public List<Studant> getStudants() {
        return List.of(
            new Studant(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
            )
        );
    }
}
