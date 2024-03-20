package de.telran.stanislavsPacage.lesson9.compareObjekt.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamplePerson {
    public static void main(String[] args) {
        Set<Person> mytreeSet = new TreeSet<>();
        mytreeSet.add(new Person("Ruslan",32));
        mytreeSet.add(new Person("Viktor",25));
        mytreeSet.add(new Person("Olga",18));
        mytreeSet.add(new Person("Sem",25));

        System.out.println(mytreeSet);
    }
}
