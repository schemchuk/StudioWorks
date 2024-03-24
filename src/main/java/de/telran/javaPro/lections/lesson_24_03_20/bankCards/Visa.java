package de.telran.javaPro.lections.lesson_24_03_20.bankCards;

public class Visa extends Card {

    private int visaId;

    public Visa(int visaId) {
        this.visaId = visaId;
    }

    @Override
    public int getId() {
        return visaId;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "visaId=" + visaId +
                '}';
    }
}

