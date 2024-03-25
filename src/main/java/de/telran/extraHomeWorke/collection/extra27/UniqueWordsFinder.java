package de.telran.extraHomeWorke.collection.extra27;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsFinder {
    public Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();

        String[] words = text.split(" ");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }

}
