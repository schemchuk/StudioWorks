package de.telran._JavaProStudio.module3.lesson2;

import de.telran._JavaProStudio.module1.bank.polimorfizm.Dog;
import de.telran._JavaProStudio.module3.lesson2.practic.Car;

import java.util.Comparator;
import java.util.function.*;

public class SimpleStandartFunctionInt {
    public static void main(String[] args) {

    //   Comparable comparable;
   //    Comparator comparator;
        // boolean ???? (T t)
        Predicate<Integer> predicate =  (temperature) -> (temperature < -30) ? false : true;
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(-34));
        System.out.println("-----------------------------");
        Predicate<Integer> predicate1 = (temperature) -> (temperature > -30);

        System.out.println(predicate1.test(-15));
        System.out.println(predicate1.test(-32));
        System.out.println("-----------MISTOk");
        predicate1 = (weight) -> weight < 15; // грузоподьемность моста
        System.out.println(predicate1.test(10));
        System.out.println(predicate1.test(20));
        System.out.println("--------------biPredicate-------------");

        // boolean ???? (T t, U u)
        BiPredicate<Integer, Double> biPredicate = (i, d) -> i >= d;
        System.out.println(biPredicate.test(4, 4.3));

        System.out.println("-----------consumer---------");

        //void accept (T t)
        Consumer<Integer> consumer = (t) -> System.out.println((t > 15) ? "warm" : "cold");
        consumer.accept((18));
        consumer.accept(0);
        System.out.println("--------------------biConsumer---------");
        //void accept (T t, U u)
        BiConsumer<Integer, Integer> biConsumer = (weight, auto) -> System.out.println( (weight > auto) ?  "no pasaran" : "yes aga");
        biConsumer.accept(10,5);
        biConsumer.accept(5,10);

        System.out.println("-----------------Suplier--------------");
        // get()
        Supplier<String> supplier = () -> {
            Car car = new Car("111222","AntilopaHnu", 3333);
            return car.getName();
        };
        System.out.println("Auto -> " + supplier.get());

        supplier = () -> "Sraka banka";
        System.out.println(supplier.get());

        System.out.println("----------------Funktion___________");
        // R apply(T t)
        Function<Integer,String> function = (i) -> String.format("Is temperatur = %d 'C", i);
        System.out.println(function.apply(15));

        System.out.println("------------------biFunktion---------------");
        // R apply(T t, U u)
        BiFunction<Integer,Double,String> biFunction = (w, k) -> (w <= k) ? " Pleace go" : "No go";
        System.out.println(biFunction.apply(100, 80.3));
        System.out.println(biFunction.apply(100, 150.3));

        System.out.println("-------------UnaryOperator-----------");
        // R apply(T t)
        UnaryOperator<Integer> unaryOperator = (i) -> i * i;
        System.out.println("Квадрат числа 12 " + unaryOperator.apply(12));


    }
}
