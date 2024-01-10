package de.telran.hexlet.forCodevars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TotalPoints {
    public static void main(String[] args) {
        String[] matchResults = {"3:1", "2:2", "0:1", /*...другие результаты...*/};
        int totalPoints = points(matchResults);
        System.out.println("Общее количество очков: " + totalPoints);
        System.out.println("-------------------------------1");

            System.out.println(duplicateCount("abcde")); // Output: 0
            System.out.println(duplicateCount("aabbcde")); // Output: 2
            System.out.println(duplicateCount("aabBcde")); // Output: 2
            System.out.println(duplicateCount("indivisibility")); // Output: 1
            System.out.println(duplicateCount("Indivisibilities")); // Output: 2
            System.out.println(duplicateCount("aA11")); // Output: 2
            System.out.println(duplicateCount("ABBA")); // Output: 2
    }

    public static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(result -> {
                    String[] scores = result.split(":");
                    int ourScore = Integer.parseInt(scores[0]);
                    int opponentsScore = Integer.parseInt(scores[1]);
                    return ourScore > opponentsScore ? 3 : (ourScore == opponentsScore ? 1 : 0);
                })
                .sum();
    }

    public static int duplicateCount(String text) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        Map<Character, Integer> charCounteMap = new HashMap<>();

        // Convert all characters to lowercase for case-insensitive comparison
        char[] characters = text.toLowerCase().toCharArray();

        for (char c : characters) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " occurs");
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
