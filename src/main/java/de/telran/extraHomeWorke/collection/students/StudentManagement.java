package de.telran.extraHomeWorke.collection.students;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentManagement {

    public static void removeStudentsAndPromote(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = calculateAverageGrade(student);
            if (averageGrade < 3) {
                iterator.remove(); // Удаляем студента, чей средний балл меньше 3
            } else {
                student.setCourse(student.getCourse() + 1); // Переводим студента на следующий курс
            }
        }
    }

    private static double calculateAverageGrade(Student student) {
        Map<String, Integer> grades = student.getGrades();
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

   public static void printStudents(List<Student> students, int course){
       System.out.println("Студенты на курсе " + course + ":");
       for (Student student : students){
           if (student.getCourse() == course) {
               System.out.println(student.getName());
           }
       }
   }
}

