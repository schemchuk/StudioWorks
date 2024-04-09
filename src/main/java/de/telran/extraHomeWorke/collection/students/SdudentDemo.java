package de.telran.extraHomeWorke.collection.students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SdudentDemo {
//    public static void main(String[] args) {
//
//        List<Student> students = new ArrayList<>();
//
//        Map<String,Integer> grades1 = new HashMap<>();
//        Map<String,Integer> grades2 = new HashMap<>();
//        Map<String,Integer> grades3 = new HashMap<>();
//
////        Student student1 = new Student("Omelyan","Group A",1,grades1);
////        Student student2 = new Student("Shlema","Group B",2,grades2);
////        Student student3 = new Student("Havrusha","Group C",3,grades3);
//        students.add(new Student("Omelyan","Group A",1,grades1));
//        students.add(new Student("Shlema","Group B",2,grades2));
//        students.add(new Student("Havrusha","Group C",3,grades3));
//
//
//        grades1.put("Singen", 3);
//        grades1.put("Turnen", 2);
//        grades2.put("Singen", 5);
//        grades2.put("Turnen", 3);
//        grades3.put("Singen", 5);
//        grades3.put("Turnen", 4);
//
//
//        System.out.println("Список студентов до удаления: ");
//        for (Student student : students){
//            System.out.println(student);
//        }
//
//        StudentManagement.removeStudentsWithLowAverage(students);
//
//        System.out.println("Список студентов После удаления: ");
//        for (Student student : students){
//            System.out.println(student);
//        }
//    }

//    public static void main(String[] args) {
//
//        List<Student> students = new ArrayList<>();
//
//        Map<String,Integer> grades1 = new HashMap<>();
//        Map<String,Integer> grades2 = new HashMap<>();
//        Map<String,Integer> grades3 = new HashMap<>();
//
//        // Создание студентов без оценок
//        Student student1 = new Student("Omelyan","Group A",1,grades1);
//        Student student2 = new Student("Shlema","Group B",2,grades2);
//        Student student3 = new Student("Havrusha","Group C",3,grades3);
//
//        // Добавление студентов в список
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        // Добавление оценок для каждого студента
//        grades1.put("Singen", 3);
//        grades1.put("Turnen", 2);
//        grades2.put("Singen", 5);
//        grades2.put("Turnen", 3);
//        grades3.put("Singen", 5);
//        grades3.put("Turnen", 4);
//
//        // Вывод списка студентов до удаления
//        System.out.println("Список студентов до удаления: ");
//        for (Student student : students){
//            System.out.println(student);
//        }
//
//        // Удаление студентов со средним баллом < 3
//        StudentManagement.removeStudentsWithLowAverage(students);
//
//        // Добавление оценок для каждого студента
//        grades1.put("Singen", 3);
//        grades1.put("Turnen", 2);
//        grades2.put("Singen", 5);
//        grades2.put("Turnen", 3);
//        grades3.put("Singen", 5);
//        grades3.put("Turnen", 4);
//
//        // Вывод списка студентов после удаления
//        // Вывод списка студентов после удаления
//        System.out.println("Список студентов после удаления: ");
//        if (students.isEmpty()) {
//            System.out.println("Список пуст.");
//        } else {
//            for (Student student : students) {
//                System.out.println(student);
//            }
//        }
//
//    }

    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();

        // Создаем оценки для каждого студента
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 4);
        grades1.put("Physics", 3);

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Physics", 3);

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 5);
        grades3.put("Physics", 4);

        // Добавляем студентов в список
        students.add(new Student("Alice", "Group A", 1, grades1));
        students.add(new Student("Bob", "Group B", 2, grades2));
        students.add(new Student("Charlie", "Group C", 3, grades3));

        // Выводим список студентов до изменений
        System.out.println("Список студентов до изменений:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Удаляем студентов со средним баллом менее 3 и переводим остальных на следующий курс

      //  StudentManagement.removeStudentsAndPromote(students);

        // Выводим список студентов после изменений
        System.out.println("Список студентов после изменений:");
        for (Student student : students) {
            System.out.println(student);
        }

        StudentManagement.printStudents(students, 2);
    }
}
