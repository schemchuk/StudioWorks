package de.telran.stanislavsPacage.lesson7;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, Dog> map = new HashMap<>();
        map.put(1, new Dog( "Rex", 2));
        map.put(2, new Dog( "Bobik", 5));
        map.put(3,new Dog("Kulko",2));
        System.out.println(map);

        Dog dogFromCollektion = map.get(2);
        System.out.println(dogFromCollektion);
    }
}
