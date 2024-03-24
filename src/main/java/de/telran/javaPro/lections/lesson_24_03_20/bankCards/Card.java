package de.telran.javaPro.lections.lesson_24_03_20.bankCards;

public abstract class Card implements Comparable<Card>{

    public abstract int getId();

    public int compareTo(Card o) {
        return this.getId() - o.getId();
    }

}
