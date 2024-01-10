package de.telran.hexlet.forCodevars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static boolean hero(int bullets, int dragons) {
       return   (dragons <= bullets / 2) ?  true :  false;


    }

    public static int[] reverseString(int n){
        List<Integer> list = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        List<Integer> reversList = list.stream()
                .sorted((a, b) -> Integer.compare(list.indexOf(b), list.indexOf(a) ))
                .collect(Collectors.toList());

        int[] reversedArray = reversList.stream()
                .mapToInt(Integer ::intValue).toArray();
        return reversedArray;
    }


    public static int[] reverse(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n должно быть больше 0");
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }

        return result;
    }
}
