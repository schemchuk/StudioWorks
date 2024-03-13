package de.telran.stanislavsPacage.lesson5.arraylist;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private long personalCode;

    public Person(String name, int age, long personalCode) {
        this.name = name;
        this.age = age;
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPersonalCode() {
        return personalCode;
    }


    public void say(){
        System.out.println("Hello! My name is " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personalCode=" + personalCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && personalCode == person.personalCode && Objects.equals(name, person.name);
    }

}

