package de.telran.stanislavsPacage.lesson9.comparator;

import java.util.Comparator;

public class PersonCompareRulesByNames implements Comparator<PersonComparator> {

    @Override
    public int compare(PersonComparator person1, PersonComparator person2) {
        return person1.name.compareTo(person2.name);
    }
}
