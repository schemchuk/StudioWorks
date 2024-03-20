package de.telran.stanislavsPacage.lesson9.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<PersonComparator> compareRules = new PersonCompareRulesByNames().thenComparing(new PersonCompareRulesById());
        Set<PersonComparator> personSet = new TreeSet<>(compareRules);
       personSet.add(new PersonComparator("Ruslan",32));
        personSet.add(new PersonComparator("Viktor",25));
        personSet.add(new PersonComparator("Olga",18));
        personSet.add(new PersonComparator("Sem",25));
        personSet.add(new PersonComparator("Viktor",35));
        System.out.println(personSet);
    }
}
