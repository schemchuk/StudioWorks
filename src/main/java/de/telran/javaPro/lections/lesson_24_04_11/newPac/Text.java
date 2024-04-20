package de.telran.javaPro.lections.lesson_24_04_11.newPac;

import java.util.*;

public class Text {


      /**
     *      * Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
     *      * Отсортировать словарь по частоте встречаемости слов (по убыванию).
     *      */

    public static void main(String[] args) {
        String text = "Абсолютно, вот текст с повторениями, о котором вы просили: В шумном городе люди спешат спешат спешат, гоняясь за мечтами мечтами мечтами. Пробки пробки пробки, раздражение нарастает нарастает нарастает. Неоновые огни огни огни, калейдоскоп цветов цветов цветов. Кофейни кофейни кофейни, аромат жареных зерен зерен зерен. Офисные здания здания здания, высокие структуры из стекла стекла стекла. Встречи тянутся тянутся тянутся, бесконечные обсуждения обсуждения обсуждения. Телефоны звонят звонят звонят, неутомимые требования требования требования. И всё же среди хаоса хаоса хаоса сердца бьют бьют бьются, ища утешения утешения утешения. В тихой ночи ночи ночи звезды мерцают мерцают мерцают, напоминая о бесконечности бесконечности бесконечности. Мечты кружатся кружатся кружатся в глубине беспокойных умов умов умов.";

        // String[] wordArr = text.split("\\s+");
        String[] wordArr = text.replaceAll("[^а-яА-Яa-zA-Z\\s]", "").toLowerCase().split("\\s+");

        // Заполнение карты частотами слов

        Map<String,Integer> wordMap = new HashMap<>();

        for (String word : wordArr){

//            int count = wordMap.getOrDefault(normalisedWort,0);
//            wordMap.put(normalisedWort, count +1);

            if (!word.isEmpty()){
                if (wordMap.containsKey(word)){
                    wordMap.put(word,wordMap.get(word) +1);
                } else wordMap.put(word, 1);
            }
        }
        System.out.println(wordMap);

        // Создание списка пар (слово, частота)

        List<Map.Entry<String,Integer>> wordList = new ArrayList<>(wordMap.entrySet());

        // Сортировка списка по убыванию частоты встречаемости слов

        wordList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println(wordList);


        // Создание нового отсортированного словаря

        Map<String, Integer> sortedWordMap = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : wordList) {
            sortedWordMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(sortedWordMap);
    }
}



