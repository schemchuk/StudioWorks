package de.telran.extraHomeWorke.collection.exatra1_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Extra4 {
    /**
     * Могут ли реализации интерфейса java.util.List хранить одинаковые
     * элементы (дубликаты)? Напишите код программы, который демонстрирует
     * ответ на этот вопрос.
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1,2,2,3,3,3,5));
        System.out.println(integerList);

        List<Integer> linkedList = new LinkedList<>(List.of(1,2,2,2,3,4,5,6,6,6,7));
        System.out.println(linkedList);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        System.out.println(stack);
    }
}
