package de.telran.stanislavsPacage.lesson24.interrupted.interrapt;

import java.util.concurrent.TimeUnit;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        Runnable task = () -> {

            while (!Thread.currentThread().isInterrupted()) {

                // ===========do something(щось робить)==========

                try {
                    System.out.println(Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                }catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                    Thread.currentThread().interrupt();
                }

                //===========
            }
            System.out.println("Thread finished");
        };


        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
        System.out.println("Main thread finished");
    }
}
