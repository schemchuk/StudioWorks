package de.telran.stanislavsPacage.lesson8.setCodeExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {

        Person person1 = new Person("Vasya", 25);
        Person person2 = new Person("Vasya", 55);
        Person person3= new Person("Opanas", 48);


        System.out.println(person1.hashCode());

        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        Set<Person> myTableSet = new HashSet<>();
        myTableSet.add(person1);
        myTableSet.add(person2);
        myTableSet.add(person3);

        System.out.println(myTableSet);


    }
}
