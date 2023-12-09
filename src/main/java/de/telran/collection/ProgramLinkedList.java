package de.telran.collection;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        System.out.println("_________________");
        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        for (String string : states){
            System.out.println(string);
        }

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        System.out.println(people);

        for (Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        Person last = people.getLast();

        System.out.println(first.getName());
        System.out.println(last.getName());

    }
}
