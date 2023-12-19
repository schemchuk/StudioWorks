package de.telran._JavaProStudio.module3.lesson1;
@FunctionalInterface
public interface SimpleFunInterface {
    void doWork();
    default void beep(){
        System.out.println("default SimpleFunInterface: beep");
    }

     static void Other(){
        System.out.println("default SimpleFunInterface: other");
    }

}
