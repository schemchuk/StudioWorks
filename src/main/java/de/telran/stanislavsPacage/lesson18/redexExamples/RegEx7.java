package de.telran.stanislavsPacage.lesson18.redexExamples;

import java.util.Arrays;

public class RegEx7 {
    public static void main(String[] args) {
        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "java, programming25  language? the. best% in the World!";

        String[] words = inputString.split("[\\W]+");
        System.out.println(Arrays.toString(words));

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя 'cat'

        String regEx = "(\\w*)cat\\S*";
        //=========

    }
}
