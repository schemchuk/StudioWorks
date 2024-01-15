package de.telran.abracadabra.collection;

import java.util.ArrayDeque;

public class ProgramArrauDeque {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        System.out.println(states);
        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.printf("Queue size: %d \n", states.size());


//        for (String string : states){
//            System.out.println(string);


            while (states.peek() != null) {
                System.out.println(states.pop());
            }

            System.out.println("_______-_________");

        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
         for(Person person : people){
             System.out.println(person.getName());
         }
        }
    }

