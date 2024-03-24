package de.telran.extraHomeWorke.collection.exatra1_4;

import java.util.ArrayList;
import java.util.List;

public class Extra3 {
    /**
     * В классе IntegerListDemo создайте список целых чисел.
     * Продемонстрируйте как:
     * - добавить в список элемент (в начало и в конец)
     * - узнать длину списка
     * - удалить элемент из списка (по интексу и без)
     * - узнать пустой список или нет
     * - обойти список и вывести на консоль каждый элемент.
     */

    public static class IntegerListDemo {
        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            intList.add(3);
            intList.add(6);
            intList.add(9);
            intList.add(12);

            intList.addFirst(1);
            intList.addLast(15);


            int count = 0;
            for (int i = 0; i < intList.size(); i++) {
                count++;
            }
            System.out.println("Длина массива " + count + " Elements");


            System.out.println(intList);

            List<String> mystring = new ArrayList<>();
            mystring.add("AA");
            mystring.add("bb");
            mystring.add("CC");
            mystring.add("CC");
            mystring.add("CC");


            mystring.remove("bb");
            mystring.remove(0);

            System.out.println(mystring);


            int count1 =0;
            for (int i = 0; i < mystring.size(); i++) {
                count1++;
            }
            System.out.println("Длина массива " + count1 + " Elements");

            System.out.println(mystring.isEmpty());

            for (String i : mystring) {
                System.out.println(i);
            }
        }

    }
}
