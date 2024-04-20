package de.telran.stanislavsPacage.lesson15.streamPractike;

import java.util.Arrays;
import java.util.Collection;

public class StreamExample6 {
    public static void main(String[] args) {
           findAndSkipCount();
    }

    public static void findAndSkipCount(){
        Collection<String> collection = Arrays.asList("a1","a2","a3","a1","a11","a10");
        System.out.println("Find first and skip ");
        String first = collection.stream()
                .findFirst()
                .orElse("Test1");

        System.out.println("First element = " + first);

        String last = collection.stream()
                .skip(collection.size() - 1)
                .findAny()
                .orElse("Test2");
        System.out.println("Last element = " + last);

        String a3Element = collection.stream()
                .filter("a3"::equals)
                .findFirst()
                .get();
        System.out.println("a3 element = " + a3Element);


        String fourthElement = collection.stream()
                .skip(3)
                .findFirst()
                        .get();
        System.out.println("FourthElement = " + fourthElement);

    }
}
