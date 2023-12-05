package de.telran.practik.pactic_4_12;

import java.util.ArrayList;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        String string = "MADAM";
        List<Character> characterList = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            characterList.add(ch);
        }
        System.out.println(characterList);


    }
}