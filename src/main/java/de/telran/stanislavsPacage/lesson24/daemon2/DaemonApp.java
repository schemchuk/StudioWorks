package de.telran.stanislavsPacage.lesson24.daemon2;



public class DaemonApp {
    public static void main(String[] args) {
        var worker = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }

                var threadName = Thread.currentThread().getName();
                System.out.println("Thread name is executing " + threadName);
            }
        }, "Worker");

        var daemon = new Thread(() -> {
            while (true) {
                //_____

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                var theadName = Thread.currentThread().getName();
                System.out.println("Thread name is executing " + theadName);

            }
        }, "Daemon");
       worker.start();
       daemon.setDaemon(true);
       daemon.start();

       var threadName = Thread.currentThread().getName();
        System.out.println("Thread name is executing " + threadName);
    }
}
