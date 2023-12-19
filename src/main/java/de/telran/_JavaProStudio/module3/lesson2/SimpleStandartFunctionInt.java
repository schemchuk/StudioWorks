package de.telran._JavaProStudio.module3.lesson2;

import de.telran._JavaProStudio.module1.bank.polimorfizm.Dog;

import java.util.Comparator;
import java.util.function.*;

public class SimpleStandartFunctionInt {
    public static void main(String[] args) {
//        Comparable comparable;
//        Comparator comparator;
        Predicate<Integer> predicate =  (temperature) -> (temperature < -30) ? false : true;
        BiPredicate<Integer, Double> biPredicate = (i, d) -> i >= d;
        System.out.println(biPredicate.test(4, 4.3));

        Consumer<Integer> consumer = (t) -> System.out.println((t > 15) ? "warm" : "cold");
        consumer.accept((18));
        consumer.accept(0);

       // BiConsumer<Integer, Integer> biConsumer = (weight, auto) -> System.out.println( (weight, auto) ?  "yt a" : "aga");

//        Supplier<Dog> dogSupplier = () -> {
//            Car Car = new Car();
//        }
//
    }
}
