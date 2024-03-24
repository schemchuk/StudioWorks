package de.telran.javaPro.lections.lesson_24_03_20.bankCards;

public class MasterCard extends Card {

    private int masterCardId;

    public MasterCard(int masterCardId) {
        this.masterCardId = masterCardId;
    }

    @Override
    public int getId() {
        return masterCardId;
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "masterCardId=" + masterCardId +
                '}';
    }
}




