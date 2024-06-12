package de.telran.javaPro.lections.lesson_24_06_05;

import java.util.concurrent.SynchronousQueue;

public class Visitor implements  Runnable{

    SynchronousQueue<String> queue;
    String order;

    public Visitor(SynchronousQueue<String> queue, String order) {
        this.queue = queue;
        this.order = order;
    }

    @Override
    public void run() {

    }

    static class Host implements Runnable{
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronousQueue queue =  new SynchronousQueue<>();
        new Thread(new Host()).start();
        Thread.sleep(5000);

        new Thread(new Visitor( queue, "Caffee"));
    }
}
