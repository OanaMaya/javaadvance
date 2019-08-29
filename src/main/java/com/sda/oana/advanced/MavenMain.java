package com.sda.oana.advanced;

import com.sda.oana.advanced.recapitulare.*;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MavenMain {
    public static void main(String[] args) {

        Person person = new Person(22, " Didi", Gender.FEMALE);
        System.out.println(person);

        Person person2 = new Person();// punem noi variabilele cu set la un constructor gol
        person2.setName(" Didi");
        person2.setAge(22);
        person2.setGender(Gender.FEMALE);

        System.out.println(person2);

        if (person.equals(person2)) { // semnul de == la comparatie se foloseste numa la primitive
            System.out.println("True: are equals");
        } else {
            System.out.println(" False: not equals");
        }
        Teacher professor = new Teacher(45, "Popescu", Gender.FEMALE, 5000, "Psihology");

        System.out.println(professor);
        List<Integer> studentGrades = new ArrayList<>();

        studentGrades.add(7);
        studentGrades.add(9);
        studentGrades.add(10);

        Student student = new Student(20, "Marian", Gender.MALE, studentGrades);

        System.out.println(student);

//        String name = "   ";
//        name.isEmpty();
//        System.out.println(name.isEmpty());
//
//        boolean isBlank = StringUtils.isBlank(name);
//        System.out.println(isBlank);


        Teacher profesor = new Teacher(35, "Anamaria", Gender.FEMALE, 0, "Math");
        Director director = new Director(55, "Ioan", Gender.MALE, 0, "Administratie");

        profesor.pay(1000);
        director.pay(2000);
        System.out.println(profesor.getSalary());
        System.out.println(director.getSalary());
    }
}


