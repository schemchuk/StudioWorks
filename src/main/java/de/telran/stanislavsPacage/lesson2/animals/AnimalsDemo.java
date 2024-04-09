package de.telran.stanislavsPacage.lesson2.animals;

public class AnimalsDemo {
    public static void main(String[] args) {
        Fish firstAnimal = new Fish();
        Dog secondAnimal = new Dog();
        Worm thirdAnimal = new Worm();

        firstAnimal.breatch();
        secondAnimal.breatch();
        thirdAnimal.breatch();
        System.out.println("===================");

        Animal[] animals = {firstAnimal,secondAnimal,thirdAnimal};

        for (Animal animal : animals){
            animal.breatch();
        }

    }
}
