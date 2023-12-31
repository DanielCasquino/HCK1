package com.example.demo;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public ResponseEntity<List<Alumno>> alumnos() {
        List<Alumno> alumnos = alumnoRepository.findAll();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnos(@PathVariable Long id) {
        Optional<Alumno> query = alumnoRepository.findById(id);
        return new ResponseEntity<>(query.get(), HttpStatus.OK);
    }
}
