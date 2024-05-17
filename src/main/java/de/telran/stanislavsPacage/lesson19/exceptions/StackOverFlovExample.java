package de.telran.stanislavsPacage.lesson19.exceptions;

import java.util.ArrayList;

public class StackOverFlovExample {
    public static void main(String[] args) {
        StackOverFlovExample no = new StackOverFlovExample();
        ArrayList list = new ArrayList();
        int count = 0;

        while (true) {
            count++;
            System.out.println(count + " ; ");
            no.stackOff(count);
        }
    }

    public void stackOff (int count) {
        count++;
        System.out.println( count + "; ");
        stackOff(count);
    }
}
