package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MySecondThread extends Thread{
    @Override
    public void run() {
        long sum = 0;

        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(getName() + " sum: " + sum);
    }
}
