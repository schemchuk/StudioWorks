package de.telran.stanislavsPacage.lesson9.lessoncod;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Banana", 90);
        scores.put("Orange", 95);
        scores.put("Apple", 85);

        Set<String> keys = scores.keySet();

        System.out.println(keys);

        scores.remove("Apple");

        System.out.println(scores);

        for (String key : keys) {
            if (scores.containsKey(key)){
                System.out.println(key + ": " + scores.get(key));
            } else {
                System.out.println(key + " is not longer in the map");
            }
        }
    }
}
