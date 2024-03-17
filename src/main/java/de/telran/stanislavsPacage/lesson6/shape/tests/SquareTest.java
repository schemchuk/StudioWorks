package de.telran.stanislavsPacage.lesson6.shape.tests;

import de.telran.stanislavsPacage.lesson6.shape.entity.Square;

public class SquareTest {
    public static void main(String[] args) {
        int sideA = 10;

        String title = "Square";
        Square square = new Square(title, sideA);

        double expertedAreaResult = 100;
        double realAreaResult = square.calculateArea();
        double expertedPerimetr = 40;
        double realPerimeterResult = square.calculatePerimeter();

        printTestResult("Square calculate area", expertedAreaResult,realAreaResult);
        printTestResult("Square calculate perimeter", expertedPerimetr,realPerimeterResult);
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
