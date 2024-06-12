package de.telran.javaPro.lections.lesson_24_05_29;

public class CafeTask {
    /**
     * Реализовать модель кафе:
     * посетитель (отдельный поток)
     * - заходит в кафе
     * - делает заказ
     * - ждет кофе
     * - пьет кофе
     * официант (отдельный поток)
     * - ждет посетителя
     * - готовит кофе
     * - приносит посетителю
     */

    static Object visitorComes = new Object();
    static Object cofeIsReady = new Object();

    static class Visitor implements  Runnable {
        @Override
        public void run() {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " commes in the Cafe");
            synchronized (visitorComes) {
                visitorComes.notify();
            }
            System.out.println(Thread.currentThread().getName() + " makes order");
            synchronized (cofeIsReady) {
                try {
                    cofeIsReady.wait(100_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " drinks coffee");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " says goodbye & goes away");
        }
    }

    static class Waiter implements Runnable {

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " waits for the visitors");
            synchronized (visitorComes) {
                try {
                    visitorComes.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " recieves order, started to make coffee");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " bring coffee to the visitor");
            synchronized (cofeIsReady) {
                cofeIsReady.notify();
            }
        }

    }

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Waiter waiter = new Waiter();

        new Thread(visitor, "Visitor").start();
        new Thread(waiter, "Waiter").start();
    }
}
