package de.telran.stanislavsPacage.lesson7;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Person, Dog> map = new HashMap<>();
        map.put(new Person("Omeljan"), new Dog( "Rex", 2));
        map.put(new Person("Anton"), new Dog( "Bobik", 5));
        map.put(new Person("Stepan"),new Dog("Kulko",2));
        System.out.println(map);

        Dog dogFromCollektion = map.get(2);
        System.out.println(dogFromCollektion);
    }
}
