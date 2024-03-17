package de.telran.javaPro.lections.lesson_24_03_13.zad;

public class Student {
//    Составить список студентов, распределенных по отдельным классам List<List<Student>> studentGrades
//- Написать метод countTotalAmount(studentGrades), который считает общее число студентов
//- Написать метод countAmountWithName(studentGrades, name), который считает количество студентов в школе с заданным именем name.
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

