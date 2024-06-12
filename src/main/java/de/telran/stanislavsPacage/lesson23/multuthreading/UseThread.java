package de.telran.stanislavsPacage.lesson23.multuthreading;

public class UseThread {
    public static void main(String[] args) throws InterruptedException {
         Thread thread = new Thread(() -> {
             try {
                 Thread.sleep(7000);
                 System.out.println("Hello World");
                 System.out.println("Finished thread");
             } catch (InterruptedException e){
                 e.printStackTrace();
             }
         });
        System.out.println("Start program");
        System.out.println("Pause 5 sec");
        thread.start();
        Thread.sleep(5000);
        System.out.println("Finished programm");

        int count = 0;
        for (int i = 0; i < 2_000_000_000; i++) {
            count++;
        }
        System.out.println(count);
    }
}

