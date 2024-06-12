package de.telran.stanislavsPacage.lesson24.demo1;

public class CounterRunable implements Runnable {

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
    }
}
