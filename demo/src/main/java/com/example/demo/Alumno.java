package com.example.demo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String lastName;
    private String code;
    private List<Grade> grades;

    public Alumno() {}

    public Long getId(){
        return this.id;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getCode(){
        return this.code;
    }

    public List<Grade> getGrades(){
        return this.grades;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setGrades(List<Grade> grades){
        this.grades = grades;
    }
}
