package de.telran.stanislavsPacage.lesson25.synchronised4;

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
