package de.telran.abracadabra.collection;

public class Person {
    private String name;
    public Person(String value){
        name = value;
    }
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
