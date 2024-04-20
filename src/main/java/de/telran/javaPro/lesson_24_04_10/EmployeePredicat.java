package de.telran.javaPro.lesson_24_04_10;

import de.telran.javaPro.lections.lesson_24_03_18.emploers.Employee;

import java.util.function.Predicate;

public class EmployeePredicat {
//    static class Employee {
//        private int age;
//
//        public Employee(int age) {
//            this.age = age;
//        }
//
//        public int getAge() {
//            return age;
//        }
//    }
//
//
//        public static void main(String[] args) {
//        Employee employee1 = new Employee(12);
//        Employee employee2 = new Employee(36);
//
//
//            Predicate<Employee> isAgeEmployees = (s) -> s.age > 18;
//            System.out.println(isAgeEmployees.test(employee1));
//            System.out.println(isAgeEmployees.test(employee2));
//        }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jonn", "Smith", 14, 40);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30);
        Predicate<Employee> isAgeEmployee = employee -> employee.getAge() > 18;
        System.out.println(isAgeEmployee.test(employee1));
        System.out.println(isAgeEmployee.test(employee2));
    }
}
