package de.telran._JavaProStudio.module5.lesson1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegular {
    public static void main(String[] args) {
        String regex = ".*www.*";
        String actualString = "www.telran.detel";


        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(actualString);
        boolean matches = matcher.matches();
        System.out.println(matches);

        System.out.println(Pattern.matches(regex, actualString));

        Pattern pattern2 = Pattern.compile("tel");
        Matcher matcher2 = pattern2.matcher(actualString);
        while (matcher2.find()) {
            System.out.println( "Pattern strarts = " + matcher2.start() + " patter ends " + matcher2.end());
        }

        System.out.println("------------------------------");

        Pattern patternInsensative = Pattern.compile("i", Pattern.CASE_INSENSITIVE);
        Matcher matcherInsensative = patternInsensative.matcher("Irina iskakf irisky");
        while (matcherInsensative.find()) {
            System.out.println( "Pattern strarts = " + matcherInsensative.start() + " patter ends " + matcherInsensative.end());
        }

        //spliterator

    }
}
