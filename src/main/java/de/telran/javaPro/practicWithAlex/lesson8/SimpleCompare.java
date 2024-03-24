package de.telran.javaPro.practicWithAlex.lesson8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleCompare {
    public static void main(String[] args) {
        Auto auto1 = new Auto("qq1122", "Audi", 2010);
        Auto auto2 = new Auto("hh1122", "bmW", 2010);
        Auto auto3 = new Auto("aa1122", "VW", 2010);
        Auto auto4 = new Auto("bb1122", "Zaporojez", 2010);


        Comparator<Auto> comparator1 = new AutoCompare();
        TreeSet<Auto> setAuto = new TreeSet<>(comparator1);
        setAuto.add(auto1);
        setAuto.add(auto2);
        setAuto.add(auto3);
        setAuto.add(auto4);

        System.out.println(setAuto);


        Comparator<Auto> comparator2 = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o2.getManufactureYear() - o1.getManufactureYear();
            }
        };


    }
    private Comparator<? super Auto> setAuto;//????????
    TreeSet<Auto> setAutonaturelOrder = new TreeSet<>(setAuto);

    Set<Auto> sets = new HashSet<>();


}
