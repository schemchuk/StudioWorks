package de.telran.extraHomeWorke.collection.tasks.heavyBox;

import java.util.*;

public class SimpleHeavyBox {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(6));
        heavyBoxes.add(new HeavyBox(3));
        heavyBoxes.add(new HeavyBox(9));
        heavyBoxes.add(new HeavyBox(7));
        heavyBoxes.add(new HeavyBox(12));
        heavyBoxes.add(new HeavyBox(15));

        /**
         * Создать динамический массив, содержащий объекты класса HeavyBox. ght
         *     Распечатать его содержимое используя for each.
         */
//        System.out.println("Содержимое динамического массива:");
//        for (HeavyBox box : heavyBoxes) {
//            System.out.println("Вес: " + box.getWeight());
//        }

        /**
         * Изменить вес первого ящика на 1
         */
//       if (!heavyBoxes.isEmpty()){
//           HeavyBox firstBox = heavyBoxes.getFirst();
//           firstBox.setWeight(1);
//
//        }
//        System.out.println("Содержимое динамического массива:");
//        for (HeavyBox box : heavyBoxes) {
//            System.out.println("Вес: " + box.getWeight());
//        }

        /**
         * Удалить последний ящик.
         */
//        if (!heavyBoxes.isEmpty()) {
//            heavyBoxes.removeLast();
//            heavyBoxes.remove(heavyBoxes.size() - 1);
//        }
//        System.out.println("Содержимое динамического массива:");
//        for (HeavyBox box : heavyBoxes) {
//            System.out.println("Вес: " + box.getWeight());
//        }

        /**
         *  Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
         */

//        System.out.println("Содержимое динамического массива:");
//
//        Iterator<HeavyBox> iterator = heavyBoxes.iterator();
//        while (iterator.hasNext()){
//            HeavyBox box = iterator.next();
//            System.out.println("Вес: " + box.getWeight());
//        }
        /**
         * Удалить все ящики
         */
//        if (!heavyBoxes.isEmpty()){
//            heavyBoxes.clear();
//        }
//        System.out.println("Содержимое динамического массива:");
//
//        Iterator<HeavyBox> iterator = heavyBoxes.iterator();
//        while (iterator.hasNext()){
//            HeavyBox box = iterator.next();
//            System.out.println("Вес: " + box.getWeight());
//        }

        /**
         * 2. Создать TreeSet
         *
         *     Создать TreeSet содержащий HeavyBox.
         *     HeavyBox должен реализовать интерфейс Comparable.
         *     Распечатать содержимое с помощью for each.
         */
//        TreeSet<HeavyBox> boxTreeSet = new TreeSet<>();
//        boxTreeSet.add(new HeavyBox(10));
//        boxTreeSet.add(new HeavyBox(20));
//        boxTreeSet.add(new HeavyBox(30));
//        boxTreeSet.add(new HeavyBox(40));
//        boxTreeSet.add(new HeavyBox(10));
//
//        for (HeavyBox box : boxTreeSet){
//            System.out.println("Вес: " + box.getWeight());
        //       }
        /**
         * 3. Набор чисел
         *
         *     Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
         *     Избавиться от повторяющихся элементов в строке.
         *     Вывести результат на экран.
         */
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите набор чисел в виде одной строки, разделенных запятыми: ");
//        String input = scanner.nextLine();
//
//        String[] inpurNumbers = input.split(",");
//
//        Set<String> mySet = new HashSet<>();
//        for (String str : inpurNumbers) {
//            mySet.add(str.trim());
//        }
//
//
//         System.out.println("Результат (без повторяющихся элементов): ");
//        Iterator<String> iterator = mySet.iterator();
//
//        while (iterator.hasNext())  {
//            String myIterator = iterator.next();
//            System.out.println(myIterator.trim());
//        }


    }
}
