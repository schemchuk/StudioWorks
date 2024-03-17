package de.telran.javaPro.lections.lesson_24_03_13.zad;

import java.util.List;

public class ExampleDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("AA", 3);
        Dog dog2 = new Dog("BB", 4);
        Dog dog3 = new Dog("CC", 2);
        Dog dog4 = new Dog("DD", 8);
        Dog dog5 = new Dog("EE", 5);
        Dog dog6 = new Dog("GG", 1);
        Dog dog7 = new Dog("MM", 10);
        Dog dog8 = new Dog("MM", 7);
        Dog dog9 = new Dog("LL", 6);

        List<Dog> group1 = List.of(dog1,dog2,dog3);
        List<Dog> group2 = List.of(dog4,dog5,dog6);
        List<Dog> group3 = List.of(dog7,dog8,dog9);
        List<List<Dog>> dogScool = List.of(group1, group2,group3);

        dogNumberScool(dogScool);
        findNumbersDogsWithName(dogScool, "MM");
    }



    public static int dogNumberScool(List<List<Dog>> dogScool){
        int count = 0;
       for ( List<Dog> dogs : dogScool){
           count += dogs.size();
       }
        System.out.println(count);
       return count;
    }

    public static int findNumbersDogsWithName(List<List<Dog>> dogScool, String name){
        int count = 0;

        for(List<Dog> dogs : dogScool){
            for (Dog dog : dogs){
                if (dog.getName().equals(name)){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

}
