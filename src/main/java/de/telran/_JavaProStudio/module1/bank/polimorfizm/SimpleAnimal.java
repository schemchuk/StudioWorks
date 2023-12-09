package de.telran._JavaProStudio.module1.bank.polimorfizm;

public class SimpleAnimal {
    public static void main(String[] args) {

        GroomerShop groomerShop = new GroomerShop();
        Animal animal = new Animal();
        animal.Voice();
        groomerShop.cut(animal);

        animal = new Dog();
        animal.Voice();
        groomerShop.cut(animal);
    }

}
