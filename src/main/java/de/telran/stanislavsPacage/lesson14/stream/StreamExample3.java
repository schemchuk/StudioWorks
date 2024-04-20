package de.telran.stanislavsPacage.lesson14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10", "20", "1", "10", "50", "25", "20", "25");
        System.out.println("Original: " + strings);

       long result = strings.stream()
                .filter(param -> param.equals("10"))
                .count();
        System.out.println("Result of filtering and counting: " + result);
        // sorted

        List<String> result2 = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Result of sorting: " + result2);

        //sorted && limit

        List<String> result3 = strings.stream()
                .sorted()
                .filter(x -> Integer.parseInt(x) > 10)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Result of sorting: " + result3);

       // sorted && skip

        List<String> result4 = strings.stream()
                .sorted()
                //.filter(x -> Integer.parseInt(x) > 10)
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("Result of sorting: " + result4);

        // distinct

        List<String> result5 = strings.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Result of sorting: " + result5);

        // peek

        System.out.println("Result of peek() method: ");
        List<String> result6 = strings.stream()
                .peek((e) -> System.out.println((e + " Hello")))
                .collect(Collectors.toList());

        System.out.println(result6);

        //map example

        System.out.println("Result of map method: ");
        List<Integer> result7 = strings.stream()
                .sorted()
                .map(x -> Integer.parseInt(x) * 25)
                .collect(Collectors.toList());

        System.out.println(result7);

    }
}
