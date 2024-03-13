package de.telran.stanislavsPacage.lesson4.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        int[] arrayForSort = {8,3,5,2,1,4,7,6};

        /*
        {8,3,5,2,1,4,7,6}  - исходный массив
        {3,8,5,2,1,4,7,6} -сравниваем первые два элемента и если левый больше то меняем их местами
        {3,5,8,2,1,4,7,6}- сравниваем вторую пару
        {3,5,2,8,1,4,7,6}
        {3,5,2,1,8,4,7,6}
        {3,5,2,1,4,8,7,6}
        {3,5,2,1,4,7,8,6}
        {3,5,2,1,4,7,6,8}- самый большой элемент оказался на последнем месте
        ------------------
        {3,5,2,1,4,7,6,8} - сравниваем первую пару - ничего не меняем
        {3,2,5,1,4,7,6,8}
        {3,2,1,5,4,7,6,8}
        {3,2,1,4,5,7,6,8}
        {3,2,1,4,5,7,6,8} -5 и 7 менять не надо
        {3,2,1,4,5,6,7,8}
        ------------------
        {2,3,1,4,5,6,7,8}
        {2,1,3,4,5,6,7,8}
        ------------------
        {1,2,3,4,5,6,7,8}
        ----------------

         */

        System.out.println("Arrays before sort:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("===============================");

        bubbleSort(arrayForSort);

        System.out.println("===============================");
        System.out.println("Arrays after sort:");
        System.out.println(Arrays.toString(arrayForSort));
    }

    static void bubbleSort(int[] workingArray){
        boolean notSorted = true;
        int temp;

        while (notSorted) {
            System.out.println(notSorted);
            System.out.println(Arrays.toString(workingArray));
            notSorted = false;

            for (int i = 0; i < workingArray.length-1; i++) {
                if (workingArray[i] > workingArray[i+1]){
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i+1];
                    workingArray[i+1] = temp;
                    notSorted = true;
                }
            }
        }
    }
}
