package de.telran.stanislavsPacage.lesson8.hacsCodeExample;

import java.util.HashMap;

public class HashExample4 {
    public static void main(String[] args) {

        Person person1 = new Person("Vasya", 25);
        Person person2 = new Person("Vasya", 30);

        Person person3 = new Person("Opanas", 24);

        System.out.println(person1.hashCode());

        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        HashMap<Person, String > myTable = new HashMap<>();
        myTable.put(person1, "String1");
        myTable.put(person2, "String2");
        myTable.put(person3, "String3");

        System.out.println(myTable);

    }
}
