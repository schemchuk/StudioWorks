package de.telran.stanislavsPacage.lesson9.mixComrare;

import java.util.Set;
import java.util.TreeSet;

public class CatCollektionExample {
    public static void main(String[] args) {

        CatComparator  comparator = new CatComparator();
        Set<Cat> cats = new TreeSet<>(comparator);

        cats.add(new Cat("Murzik",2,"color red"));
        cats.add(new Cat("Barsik",3,"color grey"));
        cats.add(new Cat("Dexter",4,"color red"));
        cats.add(new Cat("Busik",3,"color tiger"));
        System.out.println(cats);
    }
}
