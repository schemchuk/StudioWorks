package de.telran.javaPro.lections.lesson_24_04_22;

import de.telran.javaPro.lesson_24_04_17.tasks.employees.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jane", "Martin", "Nik", "Edd", "Tom", "Jane", "Tom");


        // Создать список из экземпляров класса Employee.
        Employee employee1 = new Employee("Tim", "Smith", 23, 40, true);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true);
        Employee employee4 = new Employee("Mark", "Smith", 45, 40, false);
        Employee employee5 = new Employee("John", "Smith", 23, 40, true);
        Employee employee6 = new Employee("Nina", "Smith", 12, 20, false);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        //  С помощью коллекторов:
        // Map <Имя / Employee>

        Map<String, Employee> nameToEmployeeMap = employees.stream()
                .collect(Collectors.toMap(e -> e.getName(), e -> e));

        System.out.println(nameToEmployeeMap);

        // Map <age / количество>
        Map<Integer, Integer> ageMap = employees.stream()
                .collect(Collectors.toMap(age -> age.getAge(), age -> 1, (age1, age2) -> age1 + age2));
        System.out.println(ageMap);

        // alternative
        Map<Integer, Long> ageMapFromColector = employees.stream().collect(Collectors.groupingBy(age -> age.getAge(), Collectors.counting()));
        System.out.println(ageMapFromColector);

        // Map <age / список сотрудников>

        Map<Integer, List<Employee>> employeesByAge = employees.stream()
                .collect(Collectors.groupingBy(age -> age.getAge(), Collectors.mapping(e -> e, Collectors.toList())));
        System.out.println(employeesByAge);

        // Map <isActive / количество>

        Map<Boolean, Long> isActiveMap = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.isActive(), Collectors.counting()));
        System.out.println(isActiveMap);

        // Map <Department / список сотрудников>
        
        // Map <Department / общая сумма рабочих часов>

        String string = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));


    }
}
