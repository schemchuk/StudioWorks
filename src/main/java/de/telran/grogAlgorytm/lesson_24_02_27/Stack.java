package de.telran.grogAlgorytm.lesson_24_02_27;

import java.util.Arrays;

class Stack {
     int[] items = new int[0];
    int[] args = {1, 2, 3, 4, 60, 40};

     public int push(int value) {
         int[] updatedArray = new int[items.length+1];
         for (int i=0;i<items.length;i++){
             updatedArray[i] = items[i];
         }
         updatedArray[updatedArray.length-1]=value;
         items = updatedArray;
         return items.length;
     }

    public static void Func(int... args){
        System.out.println(Arrays.toString(args));
    }

     public static void main(String[] args) {
         Stack stack = new Stack();

         stack.push(10);
         stack.push(20);

         System.out.println(Arrays.toString(new int[]{stack.push(33)}));

         System.out.println("--------------------------------------");
         System.out.println(Arrays.toString(stack.args));
     }
 }