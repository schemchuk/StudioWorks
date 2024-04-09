package de.telran.stanislavsPacage.lesson1.students;

import de.telran.stanislavsPacage.lesson1.students.entity.Aspirant;
import de.telran.stanislavsPacage.lesson1.students.entity.Person;
import de.telran.stanislavsPacage.lesson1.students.entity.Student;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Opanas", "48m");
        Student student2 = new Student("Anton", "48m");
        Student student3 = new Student("Salomon", "48m");
        Student student4 = new Student("Havrysha", "48m");

        Aspirant aspirant1 = new Aspirant("Ruslan", "Tel-Ran");

        Person[] allUniversityMembers = new Person[5];

        allUniversityMembers[0] = student1;
        allUniversityMembers[1] = student2;
        allUniversityMembers[2] = student3;
        allUniversityMembers[3] = aspirant1;
        allUniversityMembers[4] = student4;

        for (int i = 0; i < allUniversityMembers.length; i++){
            allUniversityMembers[i].greeting();
        }
    }
}
