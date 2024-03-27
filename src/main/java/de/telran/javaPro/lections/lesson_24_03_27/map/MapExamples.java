package de.telran.javaPro.lections.lesson_24_03_27.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("A", 5);
        map.put("B", 50);
        map.put("C", 10);
        map.put("D", 10);
        map.put("E" ,70);

        System.out.println(map.get("A"));
        map.put("A" ,70);
        System.out.println(map.get("A"));


        System.out.println(map.get("C"));

        System.out.println(map.containsKey("D"));

        System.out.println(map.keySet());

       Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
       for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("entry key: " + entry.getKey() + " entry value: " +  + entry.getValue());

        }
    }
}
