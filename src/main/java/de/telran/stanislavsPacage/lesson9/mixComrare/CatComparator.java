package de.telran.stanislavsPacage.lesson9.mixComrare;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int compareResult;
        compareResult = cat1.getBreed().compareTo(cat2.getBreed());
        if (compareResult == 0) {
            compareResult = cat1.getName().compareTo(cat2.getName());
        }
        return compareResult;
    }
}
