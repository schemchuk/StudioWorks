package de.telran.stanislavsPacage.lesson17.standartInputOut;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.next());
        double k = Double.parseDouble(scanner.next());

        System.out.println(n + k);

        double n2 = Double.parseDouble(scanner.next());
        String str = scanner.next();

        System.out.println(n2 + str);
    }
}
