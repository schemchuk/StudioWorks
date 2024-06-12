package de.telran.stanislavsPacage.lesson26.conkurent.semafore3;

import java.util.concurrent.Semaphore;

public class CountThread implements Runnable {
    CommonResource resource;
    String name;
    Semaphore semaphore;

    public CountThread(CommonResource resource, String name, Semaphore semaphore) {
        this.resource = resource;
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешения");
            semaphore.acquire();
            resource.x = 1;

            for (int i = 0; i < 10; i++) {
                System.out.println(name + ": " + resource.x);
                resource.x++;
                Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
        }
        System.out.println(name + " освобождает полученное разрешение");
        semaphore.release();
    }
}

