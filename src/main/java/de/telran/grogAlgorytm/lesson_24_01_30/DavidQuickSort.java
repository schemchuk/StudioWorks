package de.telran.grogAlgorytm.lesson_24_01_30;



import java.util.ArrayList;

public class DavidQuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(6);
        array.add(8);
        array.add(0);
        array.add(1);
        array.add(9);
        array.add(7);
        array.add(6);
        array.add(2);
        array.add(5);
        System.out.println(quickSort(array));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size()-1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i=0;i<arr.size()-1;i++){
            if (arr.get(i)<pivot) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        ArrayList<Integer> newArray = new ArrayList<>();

        newArray.addAll(quickSort(left));
        newArray.add(pivot);
        newArray.addAll(quickSort(right));

        return newArray;
    }
}




