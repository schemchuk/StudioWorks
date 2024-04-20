package de.telran.stanislavsPacage.lesson15.streamPractike;

import java.util.Arrays;
import java.util.Collection;

public class Example7 {
    public static void main(String[] args) {
        differentMatch();
    }
    public static void differentMatch(){

        Collection<String> collection = Arrays.asList("a1","a2","a3","a1","a11","a10");
        System.out.println("Find first and skip ");

        boolean isAnyOne = collection.stream()
                //.anyMatch(string -> string.equals("a1"));
                .anyMatch("a1"::equals);

        System.out.println(" anione is - " + isAnyOne);

        boolean isAll = collection.stream()
                .allMatch(string -> string.contains("1"));
        System.out.println(" isAll - " + isAll);

        boolean isNonEquals = collection.stream()
                .noneMatch(s -> s.contains("y"));
        System.out.println(" isNotEquals is - " + isNonEquals);
    }
}
