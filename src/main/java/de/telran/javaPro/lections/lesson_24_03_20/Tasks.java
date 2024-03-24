package de.telran.javaPro.lections.lesson_24_03_20;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

        Set<String> names = Set.of("Ivan", "Omeljan","Salomonov");
        Set<Integer> langName = new TreeSet<>();
        System.out.println(names);

        for (String str : names){

            langName.add(str.length());
        }
        System.out.println(langName);
//==============================

        String text = "Hello world!!!";
       char[] chars = text.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char c : chars){
            characterSet.add(c);
        }
        System.out.println(characterSet);
        //=================


        List<Integer> list = new ArrayList<>(List.of(2,4,1,6));

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);

    }

}
