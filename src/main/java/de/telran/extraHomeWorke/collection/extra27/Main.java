package de.telran.extraHomeWorke.collection.extra27;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Java is a programming language. Java is used for developing various applications.";
        UniqueWordsFinder wordsFinder = new UniqueWordsFinder();

        Set<String> uniqueWords = wordsFinder.find(text);

        System.out.println("Уникальные слова в тексте:");
        for (String word : uniqueWords){
            System.out.println(word);
        }
    }
}
