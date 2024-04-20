package de.telran.javaPro.lesson_24_04_10;

import java.util.function.UnaryOperator;

public class SumFunktion {
    public static void main(String[] args) {
//        Function<Integer, Integer> sumElem = (s) -> {
//            int sum = 0;
//            for (int i = 0; i < s; i++) {
//                sum+= i;
//            }
//            return sum;
//        };
//
//        int n = 10;
//        int result = sumElem.apply(n);
//        System.out.println(result);


        int n = 10;
        UnaryOperator<Integer> sum = (number) -> {
            int count =0;
            for (int i = 0; i < number; i++) {
                count += i;
            }

            return count;
        };
        System.out.println(sum.apply(n));
    }
}
