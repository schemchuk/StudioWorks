package de.telran.stanislavsPacage.lesson14.standartfi.examples;

import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        String str = " Hello World";

        Supplier<String> stringSuplier = () -> {
          String myStr =  str.toUpperCase();
          myStr = myStr.substring(7);
          return myStr;
        };

        System.out.println(stringSuplier.get());
    }
}
