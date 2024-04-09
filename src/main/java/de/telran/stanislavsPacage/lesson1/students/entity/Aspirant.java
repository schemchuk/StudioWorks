package de.telran.stanislavsPacage.lesson1.students.entity;

public class Aspirant extends Person{
    String deportment;

    public Aspirant(String name, String deportment) {
        super(name);
        this.deportment = deportment;
    }
    @Override
    public void greeting(){
       super.greeting();
        System.out.println("  I am an aspirant! My deportmen is " + deportment);
    }
}
