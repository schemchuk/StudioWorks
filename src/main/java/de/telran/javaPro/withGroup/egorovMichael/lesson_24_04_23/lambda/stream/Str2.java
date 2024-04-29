package de.telran.javaPro.withGroup.egorovMichael.lesson_24_04_23.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class Str2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6,6,7,8,9,11);

//       Set<Integer> set1 = new HashSet<>();
//
//        for ( int i = 0; i < list.size(); i++ ){
//            set1.add(list.get(i));
//        }
//        int sum = 0;
//        for (Integer s : set1){
//            if (s % 2 == 0 && s > 5){
//               sum += s;
//            }
//        }
//        System.out.println(sum);
        int[] arr = {1,2,3,4,4,5,5,6,6,7,8,9,11};
        Arrays.stream(arr)
                .distinct()
                .filter(el -> el % 2 == 0 && el > 5)
                .reduce((acc, com) -> acc + com);

        System.out.println();

        Integer s = list.stream()
                .distinct()
                .filter(el -> el % 2 == 0 && el > 5)
                .reduce((acc, com) -> acc + com)
                .get();
        System.out.println(s);
    }
}
