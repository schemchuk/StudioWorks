package de.telran.javaPro.lections.lesson_24_04_11.newPac;

import java.util.HashMap;
import java.util.Map;

public class StringConvert {
    /**
     *
     Даны две строки одинаковой длинны.

     Можно ли заменить буквы одной строки на буквы другой строки соблюдая следующие правила:
     - буква первой строки может быть заменена только на одну букву из второй строки;
     - одна и та же буква второй строки не может быть заменена на разные буквы из первой строки;
     - позиция буквы первой строки должна соответствовать позиции буквы второй строки в которую она преобразовывается.

     Пример:

     egg, add -> e:a, g:d = true
     egd, add -> e:a, g:d, d:? = false
     egg, adc -> e:a, g:d, ?:c = false
     abc, xyz -> a:x, b:y, c:z = true.

     Напишите ваше решение в виде функции:
     boolean canBeConverted(String str1, String str2).
     */
    public static void main(String[] args) {
        System.out.println("egg, add =" + canBeConverted("egg","add"));
        System.out.println("egd, add =" + canBeConverted("egd","add"));
        System.out.println("egg, adc =" + canBeConverted("egg","adc"));
        System.out.println("abc, xyz =" + canBeConverted("abc","xyz"));
    }

    public static boolean canBeConverted(String str1, String str2) {

        Map<Character,Character> firstToSecond = new HashMap<>();
        Map<Character,Character> secondToFirst = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char firstChar = str1.charAt(i);
            char secondChar = str2.charAt(i);

            if (firstToSecond.containsKey(firstChar)){
                char firstMapedTo = firstToSecond.get(firstChar);
                if (firstMapedTo != secondChar) {
                    return false;
                }
            } else {
                firstToSecond.put(firstChar,secondChar);
            }

            if (secondToFirst.containsKey(secondChar)){
                char secondMapedTo = secondToFirst.get(secondChar);
                if (secondMapedTo != firstChar) {
                    return false;
                }
            }else {
                secondToFirst.put(secondChar,firstChar);
            }
        }

        return true;
    }
}
