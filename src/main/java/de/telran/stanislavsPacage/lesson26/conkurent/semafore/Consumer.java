package de.telran.stanislavsPacage.lesson26.conkurent.semafore;

public class Consumer implements Runnable{
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            store.get();
        }
    }
}
