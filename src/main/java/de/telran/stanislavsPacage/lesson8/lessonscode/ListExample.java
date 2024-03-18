package de.telran.stanislavsPacage.lesson8.lessonscode;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        int[] arr1 = {1,7,4,9,12,45,3,9,23,1,7,12,1,7,23};
        int[] arr2 = {7,9,12,45,3,9,23,1,7,4,12,1,7,1,23};

        printResult(checkEqualArray(arr1,arr2)) ;
    }

    static void printResult(boolean isSame){
        if (isSame) {
            System.out.println("Our arrays is equal");
        }else {
            System.out.println("Our arrays is NOT equal");
        }
    }
    static boolean checkEqualArray(int[] arr1, int[] arr2){
        boolean isSame = true;
        if (arr1.length != arr2.length){
            return false;
        }


        List<Integer> arr1List = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arr1List.add(arr1[i]);
           // System.out.println(arr1List);
        }


        for (int i = 0; i < arr2.length; i++) {
            //Integer ourInt = arr2[i];
            if (arr1List.contains(arr2[i])){
                arr1List.remove((Integer) arr2[i]);
                System.out.println(arr1List);
            }
        }
       isSame = arr1List.isEmpty();
        return isSame;
    }
}
