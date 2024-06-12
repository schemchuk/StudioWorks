package de.telran.stanislavsPacage.lesson24.demo1;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
CounterRunable counterRunable1 = new CounterRunable();
CounterRunable counterRunable2 = new CounterRunable();


        Thread thread1 = new Thread(counterRunable1);
        Thread thread2 = new Thread( counterRunable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count thread1 " + counterRunable1.getCount());
        System.out.println("Count thread2 " + counterRunable2.getCount());


    }
}
