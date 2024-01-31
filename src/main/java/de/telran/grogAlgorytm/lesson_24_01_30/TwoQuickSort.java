package de.telran.grogAlgorytm.lesson_24_01_30;

import java.util.Arrays;

public class TwoQuickSort {



        public static void main(String[] args) {
            int[] array = {4,3,6,7,0,1,8,9,5};
            int index = 0;
            int pivot = array[array.length-1];
            for (int i=0;i<array.length-1;i++){
                if (array[i]<pivot) {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                    index++;
                }
            }
            int temp = array[array.length-1];
            array[array.length-1] = array[index];
            array[index] = temp;
            System.out.println(Arrays.toString(array));

        }

    }

