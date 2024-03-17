package de.telran.javaPro.summary.work_24_03_15.works;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Box implements  Iterable<String>{
//    2. Имеется класс Box
//public class Box {
//    String itemA;
//    String itemB;
//    String itemC;
//}
//Реализовать для него итератор.

    String itemA;
    String itemB;
    String itemC;

    public Box(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    public String getItemA() {
        return itemA;
    }

    public String getItemB() {
        return itemB;
    }

    public String getItemC() {
        return itemC;
    }

    @Override
    public String toString() {
        return "Box{" +
                "itemA='" + itemA + '\'' +
                ", itemB='" + itemB + '\'' +
                ", itemC='" + itemC + '\'' +
                '}';
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                int currentIndex = 0;
                if (! hasNext()){
                    throw new NoSuchElementException("ffgghh");

                }

                return false;
            }

            @Override
            public String next() {
                int currentIndex = 0;
                if (!hasNext())
                    throw new NoSuchElementException("jjklkkjjjjjjjj");
                if (currentIndex == 0) {
                    return itemA;
                } if (currentIndex == 1) {
                    return itemB;
                } if (currentIndex == 2) {
                    return itemC;
                }
                return null;
            }

            {

            }
        };
    }
}
