package de.telran.javaPro.summary.work_24_04_19;

import java.util.stream.IntStream;

public class ExampleD6 {
    public static void main(String[] args) {

        double sum = 0.0;
        for (int i = 0; i < 10_000; i++) {
            sum += 0.1;
        }
        System.out.println(sum);

        double sumStream = IntStream.range(0, 10000)
                .mapToDouble(i -> 0.1)
                .sum();

        System.out.println(sumStream);
    }
}
