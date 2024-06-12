package de.telran.stanislavsPacage.lesson26.conkurent.semafore3;

import java.util.concurrent.Semaphore;

public class Semafore3App {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        CommonResource resource = new CommonResource();

        new Thread(new CountThread(resource, "mythread 1", semaphore)).start();
        new Thread(new CountThread(resource, "mythread 2", semaphore)).start();
        new Thread(new CountThread(resource, "mythread 3", semaphore)).start();
    }
}
