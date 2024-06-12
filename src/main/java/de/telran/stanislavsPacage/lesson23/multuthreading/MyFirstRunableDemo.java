package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MyFirstRunableDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunable());
            thread.start();
        }
    }
}
