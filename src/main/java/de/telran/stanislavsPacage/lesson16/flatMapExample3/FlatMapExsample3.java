package de.telran.stanislavsPacage.lesson16.flatMapExample3;

import java.util.Arrays;
import java.util.List;

public class FlatMapExsample3 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("John",Arrays.asList("1","2","3","4")),
                new Person("Henry",Arrays.asList("5","6","1")),
                new Person("Mark",Arrays.asList("9","2","3","10")),
                new Person("Lara",Arrays.asList("9","10","1","2","3")),
                new Person("Jim",Arrays.asList("11","3","4","12")));
    }

//    public static List<Person> findMaxCommonFriends(List<Person> persons){
//        List<Person> maxFriends = new ArrayList<>();

//        Map<String, List<String>> allFriends = persons.stream()
//                .collect(Collectors.toMap(Person::getName, Person::getFriends));

//        maxFriends = persons.stream()
//                .flatMap(p1 -> persons.stream()
//                        .filter(p2 -> !p1.equals(p2))
//                        .map(p2 -> )
//                )
//
//    }
}
