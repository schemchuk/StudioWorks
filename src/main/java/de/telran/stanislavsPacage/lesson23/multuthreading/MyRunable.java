package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is: " + Thread.currentThread().getName());
    }
}
