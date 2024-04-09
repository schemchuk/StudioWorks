package de.telran.extraHomeWorke.collection.tasks.multitudes;

import java.util.HashSet;
import java.util.Set;

public class ShovMultitudes {

    public static void main(String[] args) {;

//
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//
//        Set<Integer> set3 = new HashSet<>();
//        set3.add(5);
//        set3.add(6);
//        set3.add(3);
//
        // Set<Integer> unionResult = Multitudes.union(set1, set2, set3);
        //Set<Integer> intersectResult = Multitudes.intersect(set1, set2, set3);

        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("AAA",2));
        dogs.add(new Dog("BBB",3));
        dogs.add(new Dog("SSS",2));

        Set<Dog> dogs1 = new HashSet<>();
        dogs1.add(new Dog("CCC", 3));
        dogs1.add(new Dog("DDD", 3));
        dogs1.add(new Dog("SSS", 2));

        Set<Dog> dogs2 = new HashSet<>();
        dogs2.add(new Dog("FFF", 4));
        dogs2.add(new Dog("GGG", 4));
        dogs2.add(new Dog("SSS", 2));
      Set<Dog> unionResult = Multitudes.union(dogs,dogs1,dogs2);

        System.out.println("Объединение множеств:");
        System.out.println(unionResult);

        Set<Dog>intersectResult = Multitudes.intersect(dogs,dogs1,dogs2);

        System.out.println("Пересечение множеств:");
        System.out.println(intersectResult);
    }
}
