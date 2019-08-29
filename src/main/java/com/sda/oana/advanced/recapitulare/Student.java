package com.sda.oana.advanced.recapitulare;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer> grades = new ArrayList<>();

    public Student() {
    }

    public Student(List<Integer> grades) {
        this.grades = grades;
    }

    public Student(Integer age, String name, Gender gender, List<Integer> grades) {
        super(age, name, gender);// inseamna ca cheama contructorul din parinte se poate si cu super.varialele
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public Student(Integer age, String name, Gender gender) {
        super(age, name, gender);


    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "grades=" + grades +
                '}';
    }
}
