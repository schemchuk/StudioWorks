package de.telran.javaPro.lections.lesson_24_04_08.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    private static Map<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        while (true) {
            System.out.print("Введите слово на английском языке или 'exit' для выхода : ");
            word = scanner.nextLine().trim().toLowerCase();

            if (word.equals("exit")) {
                break;
            }

            String translation = dictionary.get(word);
            if (translation != null) {
                System.out.println("Перевод: " + translation);
            } else {
                System.out.print("Слово не найдено в словаре. Введите перевод: ");
                String newWordTranslation = scanner.nextLine().trim();
                dictionary.put(word,newWordTranslation);
                System.out.println("Слово " + word + " и его перевод " +"-"+ newWordTranslation + "- сохранены в словаре.");
            }
        }
    }
}
