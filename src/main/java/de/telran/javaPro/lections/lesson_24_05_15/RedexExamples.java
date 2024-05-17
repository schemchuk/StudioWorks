package de.telran.javaPro.lections.lesson_24_05_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedexExamples {
    public static void main(String[] args) {
        String text = "words";
        String redex = "word.";

        Pattern pattern = Pattern.compile(redex);
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
        System.out.println(matches);

        System.out.println(Pattern.matches("word\\.", "words"));




    }
}
