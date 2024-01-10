package de.telran.hexlet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {

        String string = greet("Wasja", "Wasja");
        System.out.println(string);
        System.out.println("--------------------");

        System.out.println(encode("Sraka"));
        System.out.println(encode("Srakas"));
    }

    static String greet(String name, String owner) {
//        if (name.equals(owner)) {
//            return "Hello boss";
//        } else {
//            return "Hello guest";
//        }
        return Stream.of(name)
                .map(n -> n.equals(owner) ? "Hello boss" : "Hello guest")
                .findFirst()
                .orElse("Hello");
    }

    public int Liters(double time) {
        int result = (int) (time / 2);
        return result;

    }

    public static int simpleMultiplication(int n) {
        // return   (n % 2 == 0 ) ? n * 8 : n * 9;
        OptionalInt result = IntStream.rangeClosed(1, n)
                .map(i -> (n % 2 == 0) ? i * 8 : i * 9)
                .findFirst();
        return result.orElse(1);

    }

    public static int squareSum(int[] n) {
//    int sum = 0;
//    for(int number: n){
//        sum += number * number;
//    }
//    return sum;
        //}
        return Arrays.stream(n)
                .map(x -> x * x)
                .sum();
    }

    public static List<Object> filterList(final List<Object> list) {

        return list.stream()
                .filter(obj -> !(obj instanceof String))
                .collect(Collectors.toList());
    }

    static String encode(String word){
        word = word.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : word.toCharArray()) {
          charCount.put(ch,charCount.getOrDefault(ch,0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : word.toCharArray()) {
            result.append(charCount.get(ch) > 1 ? ')' : '(');
        }
        return result.toString();
    }
}

