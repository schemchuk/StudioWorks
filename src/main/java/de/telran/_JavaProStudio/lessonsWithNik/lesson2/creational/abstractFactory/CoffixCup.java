package de.telran._JavaProStudio.lessonsWithNik.lesson2.creational.abstractFactory;

public class CoffixCup extends AbstractCup {
    @Override
    public void interaction(AbstractCoffee abstractCoffee) {
        System.out.println(this + " interaction with " + abstractCoffee);
    }
}
