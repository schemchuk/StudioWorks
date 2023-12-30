package de.telran.practik.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStrim1 {
        public static void main(String[] args) {
            // Задача 1: Фильтрация четных чисел и умножение на 2.

            List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
            List<Integer> result = list.stream()
                    .filter(n -> n % 2 == 0 )
                    .map(n -> n * 2)
                    .collect(Collectors.toList());
            System.out.println("Filtr and multiplication get: " + result);

            // Задача 2: Удаление дубликатов из списка строк.
            List<String> strings = new ArrayList<>(Arrays.asList("Sraka", "Banka", "Wokulary"));
            strings.add("Sraka");
            strings.add("Sluvka");
            strings.add("Sraka");
            List<String> witoutDublication = strings.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println(witoutDublication);



            // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
            Stream<Integer> sortedStr = Stream.of(1,2,3,4,5,6)
                            .sorted((a, b) -> b.compareTo(a)) // Сортировка в порядке убывания
                            .limit(3);

            sortedStr.forEach(System.out::println);
            // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
            strings.add("Lula");
            strings.add("Korova");
            System.out.println(strings);

            System.out.println(strings.stream()
                    .filter(s -> s.startsWith("S"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList()));
            // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
            System.out.println(strings.stream()
                    .skip(2)
                    .collect(Collectors.toList()));
            // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.

            List<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30));
            list1.add(57);
            list1.add(88);
            list1.add(99);

            System.out.println(list1.stream()
                    .filter(x -> x > 50)
                    .map(x -> x * x)
                    .collect(Collectors.toList()));
            // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.

            List<String> result1 = strings.stream()
                    .filter(word -> word.contains("o"))
                    .sorted(Comparator.reverseOrder()) // Сортировка в обратном порядке
                    .collect(Collectors.toList());

            System.out.println(result1);

            System.out.println(strings.stream()
                    .filter(word -> word.contains("o"))
                            .filter(word -> word.contains("W"))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList()));
            // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
            list1.add(57);
            list1.add(49);
            list1.add(21);
            System.out.println(list1);

            System.out.println(list1.stream()
                    .filter(n -> n % 2 != 0)
                    .sorted()
                    .collect(Collectors.toList()));

            System.out.println("-------------в порядке убывания-----------------------");
            System.out.println(list1.stream()
                    .filter(n -> n % 2 != 0)
                    .sorted((a ,b) ->b - a )
                    .collect(Collectors.toList()));
            // Задача 9: Получить среднее значение чисел в списке.

            double average = list1.stream()
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .orElse(0.0);
            System.out.println(average);
            System.out.println("----------------------------------------");
            // Задача 10: Получить строку, объединяющую элементы списка через запятую.
                String recevidetString = strings.stream()
                        .collect(Collectors.joining(", "));
            System.out.println(recevidetString);
            // Задача 11: Получить список квадратов чисел из другого списка.
           List<Integer> numbersSquares =  Stream.of(2,3,4,5,6,7)
                    .filter(n -> n % 3 == 0)
                    .map(number -> number * number)
                    .collect(Collectors.toList());
            System.out.println(numbersSquares);

            // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
            List<Character> letters = strings.stream()
                    .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(letters);
            System.out.println("-------- в обратном порядке в заглавном регистре-----------");

            List<Character> letter1 = strings.stream()
                    .flatMap(word -> word.toUpperCase().chars().mapToObj(c -> (char) c))
                    .distinct()
                    .sorted((a,b) -> b - a)
                    .collect(Collectors.toList());
            System.out.println(letter1);
            // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
                   List<String> listStr =  strings.stream()
                    .limit(3)
                    .collect(Collectors.toList());
                   Collections.reverse(listStr);

            System.out.println(listStr);
            //Collections.reverse();
            // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.

            System.out.println(strings.stream()
                    .skip(2)
                    .distinct()
                    .collect(Collectors.toList()));
            // Задача 15: Фильтрация и сортировка пользователей по возрасту.
            Persons personsInstance = new Persons();
            List<Persons> makePersons = personsInstance.generatePersonList(6);
            System.out.println(makePersons.stream()
                    .filter(worker -> worker.getAge() > 18)
                    .sorted((p1,p2) -> Integer.compare(p2.getAge(),p1.getAge()))
                    .collect(Collectors.toList())

            );
        }
    }


