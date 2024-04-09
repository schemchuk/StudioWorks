package de.telran.stanislavsPacage.lesson1.students.entity;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hello! My name is " + name);
    }
}
