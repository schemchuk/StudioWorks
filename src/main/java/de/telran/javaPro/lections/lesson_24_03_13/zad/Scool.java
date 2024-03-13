package de.telran.javaPro.lections.lesson_24_03_13.zad;

import java.util.List;

public class Scool {
    private List<List<Student>> studentGrades;

    public void School(List<List<Student>> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public int countTotalAmount() {
        int count= 0;
        for (List<Student> studentList : studentGrades) {
            count += studentList.size();
        }
        return count;
    }

    public int countAmountWithName(String name) {
        int count = 0;
        for (List<Student> studentList : studentGrades) {
            for (Student student : studentList) {
                if (student.getName().equals(name)) {
                    count++;
                }
            }
        }
        return count;
    }
}
