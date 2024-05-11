package de.telran.javaPro.summary.work_24_05_10;
/**
 * Написать программу, которая
 * дает пользователю арифметическую задачу со случайными числами и проверяет ответ
 */

import java.util.Random;
import java.util.Scanner;

public class Arifmethik {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int operation = random.nextInt();

            int correctResult;
            if (operation == 1) {
                correctResult = a + b;
                System.out.println("Correct answer = " + a + b);
            } else {
                correctResult = a - b;
                System.out.println("Correct answer = " + a + "- " + b);
            }
            System.out.printf("Enter result: ");

            int result = scanner.nextInt();
            System.out.println(result == correctResult);
        }
    }
}
