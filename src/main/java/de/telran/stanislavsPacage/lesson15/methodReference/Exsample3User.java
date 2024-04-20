package de.telran.stanislavsPacage.lesson15.methodReference;

public class Exsample3User {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        UserFactory userFactory1 = (name,surname) -> new User(name, surname);
        User user = userFactory.create("Opanas", "Yowbyshenko");
        User user1 = userFactory1.create("Havrusha", "Obizyanov");

        System.out.println(user);
        System.out.println(user1);
    }
}

