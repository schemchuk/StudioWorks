package de.telran.stanislavsPacage.lesson18.redexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {

        String inputString = "aab aa aabca aaabbbc aaaaabh";

        //======= найти все вхождения комбинаций в текст
        // буква 'b' - только один раз,
        // а перед ней буква 'а' может повторяться много раз или не разу

        String regEx = "a*b";
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
