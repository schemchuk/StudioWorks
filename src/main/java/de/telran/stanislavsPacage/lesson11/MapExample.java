package de.telran.stanislavsPacage.lesson11;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(4, "four");

//        String myValue = myMap.get(2);
//        System.out.println(myValue);


//        //--------------------------- получить коллекцию Set из наборов ключ - значение ---------------
//
//        Set<Map.Entry<Integer, String>> entries = myMap.entrySet();
//
//        System.out.println("Set collection:" + entries);
//
//        for (Map.Entry<Integer,String> entry : entries) {
//            System.out.println("Key : " + entry.getKey() + " , Value : " + entry.getValue());
//        }

//        Set<Map.Entry<Integer,String>> entries = myMap.entrySet();
//        System.out.println("Set collection: " + entries);
//
//        for (Map.Entry<Integer,String> entry : entries){
//            System.out.println("Key: " + entry.getKey());
//            System.out.println("Value: " + entry.getValue());
//        }
//
//        //-------------------------- получить коллекцию List из ключей ---------------------------------
//
//        List<Integer> ourKeys = new ArrayList<>(myMap.keySet());
//
//        System.out.println(ourKeys);
//
//        for (int i = 0; i < ourKeys.size(); i++) {
//            System.out.println("Key : " + ourKeys.get(i) + " , Value : " + myMap.get(ourKeys.get(i)));
//
//        }
//
        List<Integer> ourKeys = new ArrayList<>(myMap.keySet());
        System.out.println(ourKeys);

        for (int i = 0; i < ourKeys.size(); i++){
            System.out.println("Key: " + ourKeys.get(i) + " , value: " + myMap.get(ourKeys.get(i)));
        }


        Integer[] keys = myMap.keySet().toArray(new Integer[0]);
        System.out.println(Arrays.toString(keys));

        for (int i = 1; i <= keys.length; i++) {
            System.out.println("Key: " + i + " , Value: " + myMap.get(i) );
        }

//        // -------------------------- получить коллекцию List из значений ---------------------------------
//
//
//        List<String> ourValues = new ArrayList<>(myMap.values());
//        System.out.println(ourValues);
//        List<String> ourValues = new ArrayList<>(myMap.values());
//        System.out.println(ourValues);
//        for (int i = 0; i < ourValues.size(); i++) {
//            System.out.println("Key: " + i + " , Value: " + ourValues.get(i));
//        }
        String[] values = myMap.values().toArray(new String[0]);
        System.out.println(Arrays.toString(values));
        for (int i = 1; i <= values.length; i++) {
            System.out.println("Key: " + i + " , Values: " + myMap.get(i));

        }


//
//        //
//
//        List<Map.Entry<Integer,String>> ourEntries = new ArrayList<>(myMap.entrySet());
//
//        System.out.println("List collection:" + ourEntries);
//
//        //--------------= итератор ---------------
//        System.out.println("-------- итератор----------");
//
//        Iterator iterator = myMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
           Iterator iterator = myMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
