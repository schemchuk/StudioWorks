package de.telran.grogAlgorytm.lessonsTelRan.lesson1;

import java.util.Arrays;

public class SortArrau {

        public static void main(String[] args) {
            int[] array = {50, 40, 30, 20, 10,60};

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(array));

//        int a = 5;
//        int b = 6;
//        int temp = a;
//        System.out.println("a","b");
//        a = b;
//        b = temp;
//        System.out.println("a","b");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1 + i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("------------------------------");


            int index = 0;
            while (index < array.length - 1) {
                for (int j = array.length - 2; j >= 0; j--) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                System.out.println(Arrays.toString(array));
                index++;

                System.out.println("--------------------------------------");


                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = array.length - 2; j >= i; j--) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString((array)));
            }

        }

}


