package de.telran.stanislavsPacage.lesson23.multuthreading;

public class MyFirstThread extends Thread{

        @Override
        public void run(){
            System.out.println("I'm Thread! My name is " + getName());
        }
    }

