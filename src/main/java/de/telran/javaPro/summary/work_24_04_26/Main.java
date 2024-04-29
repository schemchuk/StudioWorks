package de.telran.javaPro.summary.work_24_04_26;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<String> names = Set.of("Ivan", "Peter", "William", "Mary");
        Set<Integer> integerSet = new TreeSet<>();
        for (String s : names) {
            integerSet.add(s.length());
        }
        System.out.println(integerSet);

        List<Integer> collect = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);


      //  public static Map<Boolean, List<Integer>> getMap() {
//            Map<Boolean, List<Integer>> map = new TreeMap<>();
//            for (int i = 0; i < 100; i++) {
//                if (i % 3 == 0) {
//                    if (map.containsKey(true)) {
//                        map.get(true).add(i);
//                    } else {
//                        map.put(true, new ArrayList<>());
//                        map.get(true).add(i);
//                    }
//                } else {
//                    if (map.containsKey(false)) {
//                        map.get(false).add(i);
//                    } else {
//                        map.put(false, new ArrayList<>());
//                        map.get(false).add(i);
//                    }
//                }
//            }
//          //  return map;

  //     }



    }


    public static Map<Boolean, List<Integer>> getMap(){
        return  IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0, Collectors.toList()));
    }
}
