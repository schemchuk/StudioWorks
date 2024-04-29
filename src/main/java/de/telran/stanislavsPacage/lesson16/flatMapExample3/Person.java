package de.telran.stanislavsPacage.lesson16.flatMapExample3;

import java.util.List;

public class Person {
    private String name;
    private List<String> friends;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<String> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}

