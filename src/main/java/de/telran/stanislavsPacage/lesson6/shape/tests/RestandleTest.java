package de.telran.stanislavsPacage.lesson6.shape.tests;

import de.telran.stanislavsPacage.lesson6.shape.entity.Rectandle;

public class RestandleTest {
    public static void main(String[] args) {
        int sideA = 10;
        int sideB = 20;

        String title = "Restandle";
        Rectandle rectandle = new Rectandle(title,sideA,sideB);

        double expertedAreaResult = 200;
        double realAreaResult = rectandle.calculateArea();
        double expertedPerimetr = 60;
        double realPerimeterResult = rectandle.calculatePerimeter();

        printTestResult("Rectandle calculate area", expertedAreaResult,realAreaResult);
        printTestResult(" Rectandle calculate perimeter", expertedPerimetr,realPerimeterResult);
    }

    public static void printTestResult(String message, double expertedResult, double realResult) {
        if (expertedResult == realResult) {
            System.out.println("Test " + message + " passed OK!");
        } else {
            System.out.println("Test " + message + " passed FALL!");
            System.out.println("Expected result " + expertedResult + " , but real result is - " + realResult);

        }
    }
}
