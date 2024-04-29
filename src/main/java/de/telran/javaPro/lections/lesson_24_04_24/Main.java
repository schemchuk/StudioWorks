package de.telran.javaPro.lections.lesson_24_04_24;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Создать generic класс Box<Item>, в котором можно хранить предметы любого типа.
 * Реализовать методы:
 * - put(Item item) - положить предмет
 * - get() - извлечь предмет
 * - remove() - извлечь и удалить предмет
 * 2. Написать generic метод makeList(), который преобразует массив в список.
 * 3. Написать Generic метод makeArray(), который преобразует список в массив.
 */
public class Main {

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.put("item");
        System.out.println(box.get());

        box.remove();


        //Написать generic метод makeList(), который преобразует массив в список.
        // List<Integer> integerList = makeList(new Integer[] {1,2,3});
        List<String> strings = makeList(new String[]{"a", "b", "c"});
    }

    private static List<String> makeList(String[] tArray) {
        return Arrays.asList(tArray);
    }

}

