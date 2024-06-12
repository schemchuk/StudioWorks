package de.telran.stanislavsPacage.lesson23.multuthreading;

public class CarAppWithRunable {
    public static void main(String[] args) throws InterruptedException {
        CarWithRunable ferrari = new CarWithRunable("Ferrari");
        CarWithRunable bmw = new CarWithRunable("BMW");

        Thread ferrariThread = new Thread(ferrari);
        Thread bmvThread = new Thread(bmw);

        ferrariThread.start();
        bmvThread.start();

        Thread.sleep(200);

        System.out.println("Method continues execution... " +
                "Main method is executing by thread " + Thread.currentThread().getName());
    }
}
