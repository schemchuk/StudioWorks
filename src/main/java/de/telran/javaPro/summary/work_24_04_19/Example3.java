package de.telran.javaPro.summary.work_24_04_19;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("Fife","One", "Two","Three");
//        String word = null;
//        for (String t : list){
//            if (t.length() == 3) {
//                word = t;
//                break;
//            }
//        }
//        System.out.println(word);

       String word =  list.stream()
               .filter(s-> s.length() == 3)
               .findFirst()
               .orElse(null);
        System.out.println(word);

//        System.out.println("Sum is: " + getSum());
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

//    public static int getSumStream(List<Integer> integers){
//        integers.stream()
//                .filter(integer -> integer % 2 != 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//    }


    }

