package de.telran.stanislavsPacage.lesson24;

public class ThreadLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName() + " is runnig"));
        thread.start();

    }
}
