package de.telran.grogAlgorytm.lesson_24_02_27;

import java.util.Arrays;

public class Stacks {
    int[] items = new int[0];
    public int push(int... values){
        int[] updatedArray = new int[items.length+values.length];
        for (int i=0;i<items.length;i++){
            updatedArray[i] = items[i];
        }
        for (int i=0;i<values.length;i++){
            updatedArray[i+items.length] = values[i];
        }
        items = updatedArray;
        return items.length;
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
