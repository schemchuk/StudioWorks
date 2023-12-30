package de.telran._JavaProStudio.module3.lesson4;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SimpleWorker {
    public static void main(String[] args) {
        BiConsumer<String,String > work = (n,j) -> standartWork(n, j);
        work.accept("Opanas", "Posulaty naxuy");
        work = (n,j) -> System.out.println(n + " Idy sam " + j);
        work.accept("Salomon", " v pizdu ");

    }
//"Opanas", "Posulaty naxuy"
    static void standartWork(String worker, String work) {
        System.out.println( worker + " Vikonue robotu " + work);
    }
}
