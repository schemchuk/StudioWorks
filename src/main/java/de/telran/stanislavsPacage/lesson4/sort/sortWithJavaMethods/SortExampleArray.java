package de.telran.stanislavsPacage.lesson4.sort.sortWithJavaMethods;

import java.util.Arrays;

public class SortExampleArray {
    public static void main(String[] args) {
        int[] intArray = {76,43,245,78,245,4353,21,4524,235};
        System.out.println("Before sort: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("After sort :" + Arrays.toString(intArray));

        // создаем массив строк
        String[] stringArray =  {"Maxim",  "alex", "Daria", "Amex", "Amal"};
        System.out.println("Before sort: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("After sort :" + Arrays.toString(stringArray));


    }
}
