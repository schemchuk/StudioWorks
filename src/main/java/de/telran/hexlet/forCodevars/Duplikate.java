package de.telran.hexlet.forCodevars;

import java.util.HashSet;
import java.util.Set;

public class Duplikate {

    public static void main(String[] args) {
        // Примеры использования метода duplicateCount
        System.out.println(CountingDuplicates.duplicateCount("abcde")); // Ожидаемый вывод: 0
        System.out.println(CountingDuplicates.duplicateCount("aabbcde")); // Ожидаемый вывод: 2
        System.out.println(CountingDuplicates.duplicateCount("aabBcde")); // Ожидаемый вывод: 2
        System.out.println(CountingDuplicates.duplicateCount("indivisibility")); // Ожидаемый вывод: 1
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities")); // Ожидаемый вывод: 2
        System.out.println(CountingDuplicates.duplicateCount("aA11")); // Ожидаемый вывод: 2
        System.out.println(CountingDuplicates.duplicateCount("This section contains completed homework and teachers' comments on the")); // Ожидаемый вывод: 2
    }

    public class CountingDuplicates {
        public static int duplicateCount(String text) {
            Set<String> count = new HashSet<>();

            for (String string : text.toLowerCase().split("")) {
                if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
            }

            return count.size();
        }
    }
}


