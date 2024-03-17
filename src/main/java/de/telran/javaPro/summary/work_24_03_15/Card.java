package de.telran.javaPro.summary.work_24_03_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
    // Дан список некоторых упорядоченных данных. Необходимо "честно" перемешать данные,
// т.е. распределить их так, чтобы вероятность нахождения любого элемента на любом месте была бы одинакова.
// Например, задача перемешивания колоды карт.

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        swap(cards, 0, 4);
//        mixCards(cards);
        System.out.println(cards);
    }

    public static void mixCards(List<String> cards) {
        Random random = new Random();
        for (int i = cards.size() ; i > 0; i--) {
            int index = random.nextInt(i + 1);
            swap(cards, i, index);
        }
    }

    public static void swap(List<String> cards, int i, int j){
        String tmp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, tmp);
    }
}
