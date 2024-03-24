package de.telran.extraHomeWorke.collection.exatra1_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Extra2 {
    /**
     *      * Какие реализации интерфейса java.util.List вы знаете?
     *      * Напишите программу, которая демонстрирует создание разных списков.
     *      * PS: чем они отличаются друг от друга?
     */

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        System.out.println(integerList);

        List<Integer> linkedList = new LinkedList<>(List.of(1,2,3,4));
        System.out.println(linkedList);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(23);
        stack.push(34);
        System.out.println(stack);
    }
}
