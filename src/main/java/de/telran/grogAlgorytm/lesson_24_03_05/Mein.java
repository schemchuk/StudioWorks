package de.telran.grogAlgorytm.lesson_24_03_05;


import java.util.Arrays;

public class Mein {
    public static void main(String[] args) {

        int[] array = {25,10,5,1};
        int number = 63;
        if (greedyCoins(array,number)==-1){
            System.out.println("We couldn't get "+number+" cents using "+ Arrays.toString(array)+" combo " );
        }
        else
            System.out.println(greedyCoins(array,number));

    }
    public static int greedyCoins(int[] arr, int num){
        int remaining = num;
        int count = 0;
        for (int x:arr){
            while (remaining>=x){
                remaining = remaining-x;
                count++;
            }
        }
        if (remaining>0) return -1;
        return count;

    }
}
