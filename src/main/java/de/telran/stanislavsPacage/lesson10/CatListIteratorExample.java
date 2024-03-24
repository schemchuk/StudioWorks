package de.telran.stanislavsPacage.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CatListIteratorExample {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat mursik = new Cat("Mursik");
        Cat barsik = new Cat("Barsik");
        Cat begemot = new Cat("Begemot");
        Cat mura = new Cat("Mura");
        Cat pushok = new Cat("Pushok");
        Cat salomon= new Cat("Salomon");

        cats.add(mursik);
        cats.add(barsik);
        cats.add(begemot);
        cats.add(mura);
        cats.add(pushok);
        cats.add(salomon);

        System.out.println(cats);

        //cats.remove(begemot);

        System.out.println(cats);
        System.out.println("-------------------");



        ListIterator<Cat> catlistIterator = cats.listIterator();

        while (catlistIterator.hasNext()){
            Cat tempCat = catlistIterator.next();
            System.out.println(tempCat);

            if (tempCat.name.equals("Begemot")){
                System.out.println("equals");
                catlistIterator.remove();
                catlistIterator.add(new Cat("Burbon"));
            }
        }
        System.out.println(cats);

        while (catlistIterator.hasPrevious()){
            System.out.println(catlistIterator.previous());
        }
    }
}
