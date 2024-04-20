package de.telran.javaPro.summary.work_24_04_19;

import java.util.Arrays;
import java.util.List;

public class ExampleD4 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(getSum(integers));
        System.out.println(getSumStream(integers));
    }


    public static int getSum(List<Integer> integers) {
       int oddSum = 0;
        for(Integer i: integers) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public static int getSumStream(List<Integer> integers){
       int sumStream = integers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(i -> i)
                .sum();
        return  sumStream;
    }
}

