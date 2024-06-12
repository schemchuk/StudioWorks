package de.telran.stanislavsPacage.lesson25.synchronised4;

public class Store {
    private int produkt = 0;

    public synchronized void get(){
        while (produkt < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            produkt--;

            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе " + produkt);
            notify();

    }


    public synchronized void put(){
        while (produkt > 4) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            produkt++;

            System.out.println("Прогзводитель добавил 1 товар");
            System.out.println("Товаров на складе " + produkt);
            notify();
        }

}
