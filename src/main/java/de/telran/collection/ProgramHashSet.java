package de.telran.collection;

import java.util.HashSet;

public class ProgramHashSet {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAded = states.add("Germany");
        boolean isAded1 = states.add("USA");
        System.out.println(isAded);
        System.out.println(isAded1);
        System.out.println(states);
        System.out.println("-------------------");

        System.out.printf("set contains %d elements \n", states.size());
        System.out.println(states.size());
        for (String s : states){
            System.out.println(s);
        }
        System.out.println("-------------------------");

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Omeljan"));
        people.add(new Person("Opanas"));
        people.add(new Person("Svirid Opanasovich"));

        for (Person p : people){
            System.out.println(p.getName());
        }
    }
}
