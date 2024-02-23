package de.telran.abracadabra.multitreading;

public class Programm {
    static SomeThing mThing;

 public static void main(String[] args) {
//  mThing = new SomeThing();
//
//  Thread myThread = new Thread(mThing);
//  myThread.start();
//
//  System.out.println("Главный поток завершен...");

     Thread mythread = new Thread(new Runnable() {
         @Override
         public void run() {
             System.out.println("Привет из парал мира!");
         }
     });
     mythread.start();
     System.out.println("Главный поток завершен...");
}
 }
