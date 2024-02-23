package de.telran.practik.nik_24_02_14;

public class Singleton {
    private static Singleton instance;


    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printString("Hello!");
    }
}
