package de.telran.stanislavsPacage.lesson18.redexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {

        String inputString = "code for learn java regex";

        //======= найти все вхождения комбинаций в текст
        // где буквы должны быть в диапазоне от a - j

        String regEx = "[a-j]+";
        //=========

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        int matchCount = 0;

        while (matcher.find()){
            matchCount++;
            System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start : " + matcher.start());
            System.out.println("End : " + matcher.end());
            System.out.println("Number of match: " + matchCount);
            System.out.println("-----------");
        }

    }
}
