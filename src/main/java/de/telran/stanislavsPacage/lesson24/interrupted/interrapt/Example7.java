package de.telran.stanislavsPacage.lesson24.interrupted.interrapt;

public class Example7 implements Runnable {

    @Override
    public void run() {

        try {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running!");
            Thread.sleep(1000);
        }

            } catch (InterruptedException e) {
                System.out.println("Thread interructed");
               // Thread.currentThread().interrupt();
            }
        }


    public static void main(String[] args) throws InterruptedException {
        Example7 e7 = new Example7();

        Thread thread = new Thread(e7);
        thread.start();
        Thread.sleep(5000);

        thread.interrupt();
    }
}
