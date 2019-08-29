package com.sda.oana.advanced.recapitulare;

public class Teacher extends Person {
   private double salary;
    private String subject;

    public Teacher() {
    }

    public Teacher(double salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    public Teacher(Integer age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(Integer age, String name, Gender gender) {
        super(age, name, gender);

    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }

    //implementez metoda pay din interfata

    public void pay(double amount){ // se copiaza exact metoda din interfata si sa scriem ce sa faca in fircare clasa.
        salary = amount;
        //sau this.salary = amount

    }
}

