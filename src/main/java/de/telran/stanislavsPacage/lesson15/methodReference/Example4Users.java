package de.telran.stanislavsPacage.lesson15.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example4Users {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        user.add(new User("Opanas", "Yowbyshenko"));
        user.add(new User("Havrysha", "Obizyanov"));
        user.add(new User("Omelyan", "Kosopyzd"));
        user.sort((user1, user2) -> user1.getSurname().compareTo(user2.getSurname() ));
        user.sort(Comparator.comparing(User::getSurname));

        user.forEach(System.out::println);
    }
}
