package de.telran.stanislavsPacage.lesson14.standartfi;

import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {

        String str = " Hello World";

        Supplier<String> stringSupplier = () -> {
            String myStr = str.toUpperCase();
            myStr = myStr.substring(7);
        return myStr;};

        System.out.println(stringSupplier.get());

    }
}
