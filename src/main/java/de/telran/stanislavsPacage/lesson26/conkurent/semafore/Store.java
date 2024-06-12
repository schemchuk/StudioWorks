package de.telran.stanislavsPacage.lesson26.conkurent.semafore;

import java.util.concurrent.Semaphore;

public class Store {
    private int product =0;
    private Semaphore prducerSemafore = new Semaphore(1);
    private Semaphore consumerSemafore = new Semaphore(0);

    public void get() {
        try {
            consumerSemafore.acquire();
            product--;
            System.out.println("Покупатель купил один товар");
            System.out.println("Товаров на складе " + product);

            if (product < 1) {
                prducerSemafore.release();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public void put() {
        try {
            prducerSemafore.acquire();
            product++;
            System.out.println("Производитель добавил один товар");
            System.out.println("Товаров на складе " + product);
            if (product > 0) {
                consumerSemafore.release();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
