package de.telran._JavaProStudio.module2.lesson7;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);
        System.out.println(stack);

        stack.peek();
        System.out.println(stack.peek());
        System.out.println(stack);

        int out = stack.pop();
        System.out.println(out);
        System.out.println(stack);
    }
}
