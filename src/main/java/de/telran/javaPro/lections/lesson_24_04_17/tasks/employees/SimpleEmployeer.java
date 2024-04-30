package de.telran.javaPro.lections.lesson_24_04_17.tasks.employees;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleEmployeer {

    /**
     *Создать список из экземпляров класса Employee. С помощью стримов:
     * - вывести список активных сотрудников старше 20 лет
     * - вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
     * - вывести список фамилий сотрудников с именем John
     * - вывести список всех уникальных имен сотрудников
     */
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Smith", 23, 40, true);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true);
        Employee employee4 = new Employee("Mark", "Smith", 47, 40, false);
        Employee employee5 = new Employee("John", "Smith", 23, 40, true);
        Employee employee6 = new Employee("Inna", "Smith", 12, 20, false);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        Stream<Employee> mystream = employees.stream();

        mystream
                .filter(employee -> employee.isActive() && employee.getSurname().startsWith("M"))
                .toList().forEach(System.out::println);


        System.out.println("// вывести список активных сотрудников старше 20 лет.");

        List<Employee> list = employees.stream()
                .filter(employee -> employee.isActive() && employee.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(list);

        //     * - вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J

        list= employees.stream()
                .filter(employee -> employee.getWorkingHoursInMonth() > 30 && employee.getName().startsWith("J"))
                .toList();
        System.out.println(list);

        //     * - вывести список фамилий сотрудников с именем John
        employees.stream()
                .filter(employee -> employee.getName().startsWith("John"))
                .map(employee -> employee.getSurname())
                .toList().forEach(System.out::println);
        //     * - вывести список всех уникальных имен сотрудников
        List<String> unigNames = employees.stream()
                .map(employee -> employee.getName())
                .distinct()
                .toList();
        System.out.println(unigNames);


        //  // Список активных сотрудников старше 20 лет
        //        List<Employee> activeEmployeesOver20 = employees.stream()
        //                .filter(Employee::isActive)
        //                .filter(employee -> employee.getAge() > 20)
        //                .collect(Collectors.toList());
        //        System.out.println("Active employees over 20: " + activeEmployeesOver20);

    }
}
