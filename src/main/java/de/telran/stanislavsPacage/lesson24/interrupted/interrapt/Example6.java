package de.telran.stanislavsPacage.lesson24.interrupted.interrapt;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e) {
                System.out.println("Thtead is interrupted...");
                Thread.currentThread().interrupt();
            }
        });

        thread.start();
        // перервем поток на 5 сек
        System.out.println("Main thread sleep 5 sec ");
        Thread.sleep(5000);

        System.out.println(thread.getState());

        if (thread.isAlive()) {
            System.out.println(" My thread is alive and i try interrupt it");
            thread.interrupt();
        }

        Thread.sleep(1000);
        System.out.println(thread.getState());
    }
}
