package de.telran.practik.streams;

import com.github.javafaker.Faker;
import de.telran._JavaProStudio.module3.lesson4.Worker;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleStream {
    public static <Peoples> void main(String[] args) {

        List<Worker> workers = List.of(
                new Worker("Вася", 2000),
                new Worker("Петя", 1000),
                new Worker("Лена", 1500),
                new Worker("Гриша", 1200),
                new Worker("Сергей", 2500)
        );

        System.out.println(workers.stream()
                .mapToInt(worker -> worker.salary)
                .average()
        );
        OptionalDouble avg = workers.stream()
                .mapToInt(worker -> worker.salary)
                .average();

//Задание 1: Фильтрация списка целых чисел на нечетные числа

        List<Integer> listInt = List.of(1,2,3,4,5,6,7,8,9);

        listInt.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
                //.forEach(number -> System.out.println(number));
        System.out.println("-------------------------------------");
//Задание 2: Преобразование списка строк в список чисел
        List<String> stringList = Arrays.asList("Sraka1","Banka2","Wokularu3");
        List<Integer> integerList = (List<Integer>) stringList.stream()
                .map(s -> {
                    String nunberString = s.replaceAll("\\D", "");
                            return Integer.parseInt(nunberString);
                })
                .collect(Collectors.toList());

        List<String> strings1 = Arrays.asList("a1", "b5", "a2", "b4");

        List<Integer> minWalue = strings1.stream()
                .map(s -> Integer.parseInt(s.substring(1)))
                        .collect(Collectors.toList());
        System.out.println("min element is: " + minWalue);
        System.out.println("-------------------------");

        System.out.println("Исходный список строк: " + stringList);
        System.out.println("Преобразованный список чисел: " + integerList);
        System.out.println("----------------------------------");

//Задание 3: Суммирование списка чисел
        int sum = listInt.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Исходный список чисел: " + listInt);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("--------------------------------------");
//Задание 4: Определение максимального значения в списке
        OptionalInt maxValue = listInt.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Исходный список чисел: " + listInt);
        //System.out.println("Max value is: " + maxValue);
        maxValue.ifPresent(value -> System.out.println("Max value is: " + value));
        System.out.println("---------------min value-----------------------");

        OptionalInt minValue = listInt.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Исходный список чисел: " + listInt);
        //System.out.println("Max value is: " + maxValue);
        minValue.ifPresent(value -> System.out.println("Min value is: " + value));
        System.out.println("--------------------------------------");
//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> stringList1 = new ArrayList<>(Arrays.asList("Sraka", "Banka", "Wokulary"));
        stringList1.add("Selena");
        System.out.println(stringList1);
//        System.out.println(stringList1.stream()
//                .filter(s -> s.startsWith("S"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList())
//        );

        System.out.println("I nead array: " + stringList1.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("s"))
                .collect(Collectors.toList()));

//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        stringList1.add("rak");
        stringList1.add("Sraka");
        stringList1.add("Sraka");
        stringList1.add("I she ras Sraka");
        stringList1.add("Sra");
        stringList1.add("aka");
        System.out.println(stringList1);

        Set<String> myFilterSet = stringList1.stream()
                .filter(s -> s.length() > 4)
                .collect(HashSet ::new,Set::add,Set::addAll);
        System.out.println(myFilterSet);

        System.out.println("--------------------------");


//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
        Persons personsInstance = new Persons();
        List<Persons> makePersons = personsInstance.generatePersonList(6);

        System.out.println("----------Do sortuvannja--------------");
        for (Persons person : makePersons) {
            System.out.println(person);
        }
        System.out.println("----------pislja-----------");

        List<Persons> sortedAge = makePersons.stream()
                .sorted(Comparator.comparingInt(Persons :: getAge))
                .toList();
        for (Persons person : sortedAge) {
            System.out.println(person);
        }

        System.out.println("-----------Sortuvannja po zarplati----------------");
        List<Persons> sortedSalary = makePersons.stream()
                .sorted(Comparator.comparingDouble(Persons::getSalary))
                .collect(Collectors.toList());

        for (Persons person : sortedSalary) {
            System.out.println(person);
        }

        System.out.println("-------------------------------");

//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
     List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10,15, 30, 45);
        int sum1  = num.stream()
                .filter(k -> k % 3 == 0)
                .filter(k -> k % 5 == 0)
                .mapToInt(Integer :: intValue)
                .sum();
        System.out.println("sum is: " + sum1);
//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> unicalList = stringList1.stream()
                .map(word -> word.chars().distinct()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining()))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Список слов с уникальными символами: " + unicalList);
    }
}
