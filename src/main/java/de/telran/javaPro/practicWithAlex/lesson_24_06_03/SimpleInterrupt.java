package de.telran.javaPro.practicWithAlex.lesson_24_06_03;

public class SimpleInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Task task;
        Thread thread1 = new Thread(new Task(2, 4000_000));
        Thread thread2 = new Thread(new Task(4000_001, 700_000));
        Thread thread3 = new Thread(new Task(700_001, 1_000_000));

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(5000);
        thread1.interrupt();

        Thread.sleep(5000);
        thread2.interrupt();

        Thread.sleep(5000);
        thread3.interrupt();

    }


}
