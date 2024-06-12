package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MyFirstThreadDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyFirstThread sraka = new MyFirstThread();
            sraka.start();
        }
    }
}
