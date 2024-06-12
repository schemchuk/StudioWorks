package de.telran.stanislavsPacage.lesson23.multuthreading;

public class CarWithRunable implements Runnable{
    private final String model;

    public CarWithRunable(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        try {
            System.out.println("Start! " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Car " + model + "is being driven by thread" + Thread.currentThread().getName());
    }
}
