package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MySecondThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MySecondThread mySecondThread = new MySecondThread();
            mySecondThread.start();
        }
    }
}
