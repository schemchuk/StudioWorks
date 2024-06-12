package de.telran.stanislavsPacage.lesson24.interrupted.sleep;

public class HelloWordlApp {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                int sekWait = 10;
                System.out.println("Tread is starting ...");
                Thread.sleep(sekWait * 1000);
               // TimeUnit.SECONDS.sleep(....);
                System.out.println("Thread is finish ...");
            }catch (InterruptedException e) {
            }
        };
          Thread thread = new Thread(task);
          thread.start();
    }
}
