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
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public ResponseEntity<List<Grade>> grades() {
        List<Grade> grades = gradeRepository.findAll();
        return new ResponseEntity<>(grades, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> getGrades(@PathVariable Long id) {
        Optional<Grade> query = gradeRepository.findById(id);
        return new ResponseEntity<>(query.get(), HttpStatus.OK);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<List<Grade>> getAlumnoGrades(@PathVariable Long id) {
        Optional<Alumno> query = alumnoRepository.findById(id);
        if (query.isPresent()) {
            return new ResponseEntity<>(query.get().getGrades(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
