package de.telran.extraHomeWorke.collection.exatra1_4;

import de.telran.abracadabra.collection.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Extra1 {
    /**
     * Какие реализации интерфейса java.util.List вы знаете?
     * Напишите программу, которая демонстрирует создание разных списков.
     * PS: чем они отличаются друг от друга?
     * @param args
     */
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Person> personLinkedList = new LinkedList<>();

        arrayList.add("Sraka");
        arrayList.add("Banka");

    }
}
