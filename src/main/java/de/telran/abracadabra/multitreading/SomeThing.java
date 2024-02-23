package de.telran.abracadabra.multitreading;

public class SomeThing implements Runnable{
    @Override
    public void run() {
        System.out.println("Привет из парал мира!");
    }
}
