package de.telran.stanislavsPacage.lesson25.synchronised1;

public class CommonResourse {

    int x;

    synchronized void increment() {

        x = 1;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d \n ", Thread.currentThread().getName(), x);

            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
