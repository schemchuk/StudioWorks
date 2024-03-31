package de.telran.stanislavsPacage.lesson11.tree.tree2;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compereResult = o1.getAge() - o2.getAge();
        if (compereResult == 0) {
            compereResult = o1.getName().compareTo(o2.getName());
        }
        return compereResult;
    }
}
