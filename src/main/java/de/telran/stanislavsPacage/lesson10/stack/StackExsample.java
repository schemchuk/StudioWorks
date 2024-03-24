package de.telran.stanislavsPacage.lesson10.stack;

import java.util.Stack;

public class StackExsample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("I");
        stack.push("love");
        stack.push("Samogon");
        System.out.println(stack);

        String str = stack.peek();
        System.out.println(str);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.search("I"));
    }
}
