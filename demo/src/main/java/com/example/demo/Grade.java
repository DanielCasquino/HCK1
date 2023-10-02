package com.example.demo;

public class Grade {
    private Long id;
    private Alumno alumno;
    private Long score;

    public Grade(){}

    public Long getId(){
        return this.id;
    }

    public Alumno getAlumno(){
        return this.alumno;
    }

    public Long score(){
        return this.score;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }

    public void setScore(Long score){
        this.score = score;
    }
}
