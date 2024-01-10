package de.telran.practik.practic_18_12;

import static de.telran.practik.practic_18_12.Test.m;

public class Test {
    public static void main(String[] args) {
        m(Test::ref);
    }

    public static void ref(){
        System.out.println("*****");
    }
    public static void m(Inter inter){
        inter.get();
    }
}

@FunctionalInterface
interface Inter{
    void get();
    int hashCode();
}