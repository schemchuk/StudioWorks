package de.telran.hexlet.forCodevars;

import java.util.Arrays;

public class Kata_02_01 {
    public static String MakeUpperCase(String str){

        return str.toUpperCase();
    }

    public static boolean check(Object[] a, Object x) {
        for (Object el : a) {
            if (el.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static int findShort(String s) {

        String[] words = s.split(" ");
        int shortLength = Integer.MAX_VALUE;

        for (String word : words){
            int length = word.length();
            if(length < shortLength){
                shortLength = length;
            }
        }
        return shortLength;
    }
}
