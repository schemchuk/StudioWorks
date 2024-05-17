package de.telran.stanislavsPacage.lesson19.exceptions;

public class Example1 {
    public static void main(String[] args) {

        System.out.println(divide(4,2));
        System.out.println(divide(0,2));
        System.out.println(divide(4,0));
        System.out.println(divide(10,2));

        System.out.println("End Programm");

    }
    public static double divide(int x, int y) {
        double result = x / y;

        return result;
    }
}
