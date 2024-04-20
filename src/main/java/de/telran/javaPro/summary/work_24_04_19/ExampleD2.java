package de.telran.javaPro.summary.work_24_04_19;

import java.util.ArrayList;
import java.util.List;

public class ExampleD2 {
    public static void main(String[] args) {
        List<Double> doubleList = List.of(1.0, 2.3, 3.0, 5.0, 7.1,9.0);
        List<Double> doubles = new ArrayList<>();

        for (Double d : doubleList) {
            if (d % 2 == 1) {
                doubles.add(d);
            }
        }
        System.out.println(doubles);

        List<Double> doubleListStream = doubleList.stream()
                .filter(x -> x % 2 == 1)
                .toList();
        System.out.println(doubleListStream);
    }


}
