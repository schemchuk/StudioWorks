package de.telran.stanislavsPacage.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatIteratorExample {
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

//        for (Cat tempCat : cats){
//            if (tempCat.name.equals("Begemot")) {
//                cats.remove(tempCat);// низзя в форейче
//            }
//            System.out.println(tempCat);
//        }

        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            System.out.println(catIterator.next());
        }
        Iterator<Cat> catIterator2 = cats.iterator();

        while (catIterator2.hasNext()){
            Cat tempCat = catIterator2.next();
            if (tempCat.name.equals("Begemot")){
                System.out.println("equals");
                catIterator2.remove();
            }
        }
        System.out.println(cats);
    }
}
