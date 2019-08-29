package com.sda.oana.advanced.recapitulare;

public class Director extends Teacher {

    public Director() {
    }

    public Director(double salary, String subject) {
        super(salary, subject);
    }

    public Director(Integer age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender, salary, subject);
    }

    public Director(Integer age, String name, Gender gender) {
        super(age, name, gender);
    }

    //implementam metoda din interface
    // daca mosteneste Teacher, mosteneste si implementarea interfetei Payable.

    public void pay(double amount){
        super.setSalary(amount*2);




    }
}


