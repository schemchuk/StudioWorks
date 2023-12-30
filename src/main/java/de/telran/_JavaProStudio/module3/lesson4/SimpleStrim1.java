package de.telran._JavaProStudio.module3.lesson4;

import lombok.AllArgsConstructor;

import java.util.List;

public class SimpleStrim1 {
    public static void main(String[] args) {
        List<Worker1> workers = List.of(
                new Worker1("Opanas", 2000),
                new Worker1("Anton", 1500),
                new Worker1("Havrusha", 1000),
                new Worker1("Salomon", 1200),
                new Worker1("Stepan", 2500)
                );
        System.out.println( workers.stream()
                .mapToInt(worker -> worker.salary)
                .average()
        );
    }
}
@AllArgsConstructor
 class Worker1 {
    String name;
     int salary;
 }