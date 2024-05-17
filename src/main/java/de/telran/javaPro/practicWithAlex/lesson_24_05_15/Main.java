package de.telran.javaPro.practicWithAlex.lesson_24_05_15;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     *  Разбить текст на слова с помощью шаблона регулярного выражения и расчитать
     * словарь встречающихся слов для этого текста
     * (подсчитать количество одинаковых слов, встречающихся в этом тексте).
     */
    public static void main(String[] args) {
        String text = "A regular expression is a sequence of characters that forms a search pattern.\n" +
                "When you search for data in a text, you can use this search pattern to describe what you are searching for.\n" +
                "A regular expression can be a single character, or a more complicated pattern.\n" +
                "Regular expressions can be used to perform all types of text search and text replace operations." ;

        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            wordCount.put(word,wordCount.getOrDefault(word , 0) +1);

        }
        System.out.println("Словарь истречающихся слов: ");

        for(Map.Entry<String, Integer> entru : wordCount.entrySet()){
            System.out.println(entru.getKey() + " , " + entru.getValue());
        }


    }
}
