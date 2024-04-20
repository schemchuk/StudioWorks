package de.telran.javaPro.lections.lesson_24_04_15;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionExamples {
    public static void main(String[] args) {
//        Consumer<Integer> consumer1 = integer -> System.out.println(integer);
//      Consumer<Integer> consumer2 =  consumer1.andThen(integer -> System.err.println(integer + 10));
//       consumer1.andThen(integer -> System.err.println(integer + 20));
//      consumer2.accept(10);

        Consumer<Integer> consumer = (integer -> System.out.println(integer));
        Consumer<Integer> comositeConsumer = consumer
                .andThen(integer -> System.out.println(integer + 10))
                .andThen(integer -> System.out.println(integer + 20));

        comositeConsumer.accept(10);
        comositeConsumer.accept(99);

        Predicate<String> isLongEnough = (s) -> s.length() > 3;
        Predicate<String> startsWithS = (s) -> s.startsWith("S");
        Predicate<String> compositePredicate = isLongEnough.negate().and(startsWithS);

        System.out.println(compositePredicate.test("Hello"));
        System.out.println(compositePredicate.test("Summer"));
        System.out.println(compositePredicate.test("Sum"));


        Function<String, String> function1 = s -> s + " 1";
        Function<String, String> function2 = s -> s + " 2";
        Function<String, String> function3 = s -> s + " 3";
        Function<String, String> compositeFunction = function1.andThen(function2).andThen(function3);

        String result = compositeFunction.apply("Test data");
        System.out.println(result);

        compositeFunction = function1.compose(function2).compose(function3);
        result = compositeFunction.apply("Test data");
        System.out.println(result);

        /**
         * 1.Создать три функции:
         * - обрезает входную строку до 11 символов,
         * - добавялет текст "Info: " перед
         * - делает основной текст upper case
         * Составить композитную функцию так, чтобы:
         * Input:
         * "Some random data"
         * Output:
         * "Info: SOME RANDOM
         */


        function1 = s -> s.substring(0,11);
        function2 = s -> "Info: " + s;
        function3 = s -> s.toUpperCase();

        Function<String,String> resultFunktion = function1.andThen(function3).andThen(function2);
        System.out.println(resultFunktion.apply("Some random data: "));

        resultFunktion = function2.compose(function3).compose(function1);
        System.out.println(resultFunktion.apply("Some random data: "));
    }
}
