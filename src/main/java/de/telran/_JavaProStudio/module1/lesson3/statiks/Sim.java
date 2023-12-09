package de.telran._JavaProStudio.module1.lesson3.statiks;

public class Sim {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka");
        Cat cat2 =new Cat("Barsik");
        System.out.println(cat1.name + "--->" + cat1.countCats);
        System.out.println(cat1.name + "--->" + cat2.countCats);

        Cat.inc();
        System.out.println(Cat.countCats);
        cat1.setAge(2);
        //setAge(cat1, 2)

    }
}
