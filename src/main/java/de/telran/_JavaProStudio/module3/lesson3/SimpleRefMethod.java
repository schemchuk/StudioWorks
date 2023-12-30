package de.telran._JavaProStudio.module3.lesson3;

import java.util.List;

public class SimpleRefMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.forEach((el) -> System.out.println(el));
        System.out.println("----------Ссылка на метод----------------");
        list.forEach(System.out::println);

    }
//    private static  Integer parse(String  s) {
//        Integer integer =
//
//    }
}
