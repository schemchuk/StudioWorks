package de.telran.polimorfizm;

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
