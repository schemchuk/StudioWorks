package de.telran.javaPro.lections.lesson_24_04_17.tasks.employees;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;
    private boolean isActive;

    public Employee(String name, String surname, int age, int workingHoursInMonth, boolean isActive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth=" + workingHoursInMonth +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employeer = (Employee) o;
        return age == employeer.age && workingHoursInMonth == employeer.workingHoursInMonth && isActive == employeer.isActive && Objects.equals(name, employeer.name) && Objects.equals(surname, employeer.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, workingHoursInMonth, isActive);
    }
}
