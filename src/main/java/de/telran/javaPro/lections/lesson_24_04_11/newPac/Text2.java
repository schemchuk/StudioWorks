package de.telran.javaPro.lections.lesson_24_04_11.newPac;

import java.util.*;

public class Text2 {
    /**
     * * Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
     * * Отсортировать словарь по частоте встречаемости слов (по убыванию).
     */

    public static void main(String[] args) {
        String text = "Абсолютно, вот текст с повторениями, о котором вы просили: В шумном городе люди спешат спешат спешат, гоняясь за мечтами мечтами мечтами. Пробки пробки пробки, раздражение нарастает нарастает нарастает. Неоновые огни огни огни, калейдоскоп цветов цветов цветов. Кофейни кофейни кофейни, аромат жареных зерен зерен зерен. Офисные здания здания здания, высокие структуры из стекла стекла стекла. Встречи тянутся тянутся тянутся, бесконечные обсуждения обсуждения обсуждения. Телефоны звонят звонят звонят, неутомимые требования требования требования. И всё же среди хаоса хаоса хаоса сердца бьют бьют бьются, ища утешения утешения утешения. В тихой ночи ночи ночи звезды мерцают мерцают мерцают, напоминая о бесконечности бесконечности бесконечности. Мечты кружатся кружатся кружатся в глубине беспокойных умов умов умов.";

        // String[] wordArr = text.split("\\s+");
        String[] wordArr = text.replaceAll("[^а-яА-Яa-zA-Z\\s]", "").toLowerCase().split("\\s+");

        Map<String, Integer> mapStr = new TreeMap<>();

        for (String word : wordArr) {
//            if (!word.isEmpty()){
//                if (mapStr.containsKey(word)) {
//                    mapStr.put(word, mapStr.get(word) + 1);
//
//                }else mapStr.put(word,1);
//            }
//        }
            int count = mapStr.getOrDefault(word, 0);
            mapStr.put(word, count + 1);
        }
                // System.out.println(mapStr);

                List<Map.Entry<String, Integer>> mapSort = new ArrayList<>(mapStr.entrySet());
                mapSort.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                // System.out.println(mapSort);


                for (Map.Entry<String, Integer> entry : mapSort) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

            }
        }
