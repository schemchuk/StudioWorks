package de.telran.javaPro.withGroup.egorovMichael.lesson_24_04_23.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Str3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("We", "As");
        list.stream()
                .map(str -> {
                    if (str.startsWith("W")){
                        str = str.toLowerCase();
                        System.out.println("$$$$$");
                    }
                    return str;
                })
                .collect(Collectors.toList());
    }
}
