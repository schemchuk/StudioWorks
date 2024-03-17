package de.telran.stanislavsPacage.lesson7;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ruslan");
        map.put(2, "Omeljan");
        map.put(3, "Lilja");
        map.put(4, "Salomon");
        System.out.println(map);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ruslan", 21);
        map2.put("Omeljan", 42);
        map2.put("Lilja", 33);
        System.out.println(map2);
    }
}
