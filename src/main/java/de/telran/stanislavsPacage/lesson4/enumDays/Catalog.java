package de.telran.stanislavsPacage.lesson4.enumDays;

public class Catalog {
    String description;

    Day currentDay;

    @Override
    public String toString() {
        return "Catalog{" +
                "description='" + description + '\'' +
                ", currentDay=" + currentDay +
                '}';
    }
}
