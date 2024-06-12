package de.telran.javaPro.practicWithAlex.lesson_24_05_27;

import java.util.concurrent.atomic.AtomicInteger;

public class GasStation {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger gas =  new AtomicInteger(1000);
        int count = 1;
        System.out.println(gas);
       Thread thread=  new Thread(new Car1(count, gas));
        thread.start();
        thread.join();
        count++;
        System.out.println(gas);





    }



}
class Car1 implements Runnable {
    private int countLiters = 40;
    private AtomicInteger barrelGas;
    private int numberThread;

    public Car1(int numberThread, AtomicInteger barrelGas) {
        this.numberThread = numberThread;
        this.barrelGas = barrelGas;
    }


    @Override
    public void run() {

        if (barrelGas.get() >= countLiters) {
            barrelGas.addAndGet(-countLiters);
            System.out.println("Автомобиль " + numberThread + " заправился");
            System.out.println("В бочке осталось " + barrelGas );
        } else {
            System.out.println(" Nou gas");
        }

    }
}
