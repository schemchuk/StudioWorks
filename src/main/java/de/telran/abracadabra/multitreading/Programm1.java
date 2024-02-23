package de.telran.abracadabra.multitreading;

 class AffaleThread extends Thread{
     @Override
     public void run() {
         System.out.println("Привет из парал мира!");
     }
}
public class Programm1 {
     static AffaleThread mSecondThread;

    public static void main(String[] args) {
        mSecondThread = new AffaleThread();
        mSecondThread.start();

        System.out.println("Главный поток завершён...");
    }

}
