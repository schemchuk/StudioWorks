package de.telran.extraHomeWorke.exepscens.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandLingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите целое число\n");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка:  введено не целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Введено целое число: " + number);
        scanner.close();
    }
}
