package de.telran._JavaProStudio.module6.lesson1;

public class SimpleMulti {
    public static void main(String[] args) {
        Thread tr1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Potok 1 -> " + i);
                }
            }
        };
    }
}
