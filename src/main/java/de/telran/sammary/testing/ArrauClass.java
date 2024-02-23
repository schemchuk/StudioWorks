package de.telran.sammary.testing;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrauClass {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer> ();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(-1);

//        boolean isAdd = isAddElement(arrayList, 9);
//        System.out.println(isAdd);

        System.out.println( arrayLength(arrayList));

    }

    public static int arrayLength(List<Integer> arr) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            counter++;
        }
        return counter;
    }

    public static boolean isAddElement(List<Integer> arr, int element) {
        if (arr.size() < 5) {
           arr.add(element);
          return  true;
        } else {
            return false;
        }

    }
}
//( 1, 3, 5, 7)