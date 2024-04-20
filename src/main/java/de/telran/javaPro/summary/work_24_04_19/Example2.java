package de.telran.javaPro.summary.work_24_04_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        List<Double> doubleList = Arrays.asList(12.1, 34.23, 54.12, 55.00,15.00);
        for (Double d : doubleList) {
            if (d % 2 == 1) {
                doubles.add(d);
            }
        }
        System.out.println(doubles);

        List<Double> result = doubleList.stream()
                .filter(p -> p % 2 == 1)
                .toList();

        System.out.println(result);


    }


}
