package de.telran.stanislavsPacage.lesson5.myCode.arrayList;

import java.util.ArrayList;

public class ArraysListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());

        stringArrayList.add("AAA");
        stringArrayList.add("BBB");
        stringArrayList.add("CCC");
        stringArrayList.add(0,"DDD");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            String tempString = stringArrayList.get(i);
            System.out.println( i + " й элемнет коллекции : " + tempString);
        }

        stringArrayList.remove(0);
        System.out.println(stringArrayList);

       // stringArrayList.remove("BBB");
        System.out.println(stringArrayList);

         // for (String string : stringArrayList)
            //  stringArrayList.remove(0);

        System.out.println(stringArrayList);

        System.out.println(stringArrayList.size());
        for (int i = 0; i < stringArrayList.size(); i++) {
             System.out.println(stringArrayList.size());  
            System.out.println("index = " + i);
            System.out.println("Current collektion sise: " + stringArrayList);
            stringArrayList.remove(i);
             System.out.println("Collection: after delete " + stringArrayList);
            System.out.println("+++++++++++++++++++");
        }
        System.out.println(stringArrayList);
    }
}
