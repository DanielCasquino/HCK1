package com.example.demo;

import java.util.List;

public class Alumno {
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
