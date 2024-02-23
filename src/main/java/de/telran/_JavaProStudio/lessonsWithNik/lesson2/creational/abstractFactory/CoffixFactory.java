package de.telran._JavaProStudio.lessonsWithNik.lesson2.creational.abstractFactory;

public class CoffixFactory extends AbstractFactory{

    @Override
    public AbstractCoffee createAbstractCoffee() { // Upcast
        return new CoffixCoffee();
    }

    @Override
    public AbstractCup createAbstractCup() {
        return new CoffixCup();
    }

    @Override
    public AbstractLid createAbstractLid() {
        return new CoffixLid();
    }
}
