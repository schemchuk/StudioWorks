package de.telran.stanislavsPacage.lesson11.tree.tree2;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Student student1 = new Student(18,"Jonn");
        Student student2 = new Student(19,"Tomas");
        Student student3 = new Student(18,"Olga");
        Student student4 = new Student(19,"Sem");
        Student student5 = new Student(20,"Vitaliy");

       // -------------HashSet collections--------------------------
        Set<Student> ourSetStudents = new HashSet<>();
        ourSetStudents.add(student1);
        ourSetStudents.add(student2);
        ourSetStudents.add(student3);
        ourSetStudents.add(student4);
        ourSetStudents.add(student5);

        System.out.println(ourSetStudents);

        //-----------------TreeSet collections____________________________

        Set<Student> ourTreeSetStudents = new TreeSet<>();
        ourTreeSetStudents.add(student1);
        ourTreeSetStudents.add(student2);
        ourTreeSetStudents.add(student3);
        ourTreeSetStudents.add(student4);
        ourTreeSetStudents.add(student5);

        System.out.println(ourTreeSetStudents);

        //-----------------TreeSet collections____________________________

        TreeMap<Integer, Student> ourTreeMapStudents = new TreeMap<>();
        ourTreeMapStudents.put(1,student1);
        ourTreeMapStudents.put(2,student2);
        ourTreeMapStudents.put(3,student3);
        ourTreeMapStudents.put(4,student4);
        ourTreeMapStudents.put(5,student5);

        System.out.println(ourTreeMapStudents);

        //-----------------TreeSet collections by age____________________________

        Comparator comparator = new StudentAgeComparator();

        TreeMap< Student, Integer> ourTreeMapStudentsByAge = new TreeMap<>(comparator);
        ourTreeMapStudentsByAge.put(student1,1);
        ourTreeMapStudentsByAge.put(student2,2);
        ourTreeMapStudentsByAge.put(student3,12);
        ourTreeMapStudentsByAge.put(student4,4);
        ourTreeMapStudentsByAge.put(student5,15);

        System.out.println(ourTreeMapStudentsByAge);

    }
}
