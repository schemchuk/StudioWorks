package de.telran.javaPro.lections.lesson_24_05_15;

import java.util.regex.Pattern;

public class Main {
    /**
     * 1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
     * 2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
     */
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[0-9]{4}", "1238"));
        System.out.println(Pattern.matches("\\d{4}", "1238"));
        System.out.println(Pattern.matches("\\d\\d\\d\\d", "1238"));
        System.out.println(Pattern.matches("[0-9]{4}", "1238"));

        System.out.println("================");

        String fRedex = "F[1-9] | (F1[0-2])";
        System.out.println(Pattern.matches(fRedex, "F1"));
        System.out.println(Pattern.matches(fRedex, "F8"));
        System.out.println(Pattern.matches(fRedex, "F12"));
        System.out.println(Pattern.matches(fRedex, "F91"));
        System.out.println(Pattern.matches(fRedex, "F13"));
    }
}
