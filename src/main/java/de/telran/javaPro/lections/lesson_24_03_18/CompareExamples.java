package de.telran.javaPro.lections.lesson_24_03_18;

import de.telran.stanislavsPacage.lesson8.hacsCodeExample.mapKeyCollision.Cat;

public class CompareExamples {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println( a > b);

        char c1 = 'a';
        char c2 = '\n';
        System.out.println(c1 < c2);

        Cat cat = new Cat("Tom");
        Cat cat1 = new Cat("Mursik");
        System.out.println("------------------");

        String str1 = "DOG";
        String str2 = "CAT";
        System.out.println(str1.compareTo(str2));


    }
}
