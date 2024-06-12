package de.telran.stanislavsPacage.lesson24.synchroniz;

public class SynchronisedDemo1 {
    /**
     *     Модификатор доступа
     *     synchronized return_type MethodName(parameters() {
     *     ...}
     *
     *
     *     Оператор:
     *
     *     synchronized(reference) {
     *     //операторы которые мы хотим синхронизировать
     *     // ....}
     *
     */
    public static void main(String[] args) throws InterruptedException {

        Object objectLock = new Object();

        Runnable task = () -> {
            int count = 0;
            synchronized (objectLock) {
                count++;
                System.out.println("Thread: " + Thread.currentThread().getName());
                System.out.println(count);

            }
        };
        Thread thread = new Thread(task);
        thread.start();

        thread.sleep(1);

        synchronized (objectLock) {
            for (int i = 0; i < 8; i++) {
                System.out.println(thread.getState());
                Thread.sleep(1000);
                System.out.println( " " + i);

            }
            System.out.println(".............");
        }
    }
}
