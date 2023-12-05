package de.telran.module2.lesson4;

import java.util.HashSet;
import java.util.Set;

public class SimpleData {
    @Override
    public String toString() {
        return "SimpleData{}";
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mura", 23, "xz");
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println();

        Cat cat3 = new Cat("Mura", 23, "xz");
        System.out.println(cat1 == cat3);
        System.out.println(cat1.equals(cat3));

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Mura", 12,"xz"));

    }
}
