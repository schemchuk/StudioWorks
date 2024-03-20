package de.telran.stanislavsPacage.lesson9.comparator;

import java.util.Comparator;

public class PersonCompareRulesById implements Comparator<PersonComparator> {

    @Override
    public int compare(PersonComparator person1, PersonComparator person2) {
        return person1.id - person2.id;
    }
}
