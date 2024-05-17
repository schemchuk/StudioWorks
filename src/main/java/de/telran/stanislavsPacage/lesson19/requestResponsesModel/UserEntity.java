package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class UserEntity {
    String name;

    public UserEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
