package de.telran.stanislavsPacage.lesson24.synchroniz;

public class CounterTester {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        for (int i = 0; i < 10; i++) {
            CounterThread counterThread = new CounterThread(counter);
            counterThread.start();
        }

        Thread.sleep(3000);
        System.out.println("counter = " + counter.getCounter());
    }
    
}
