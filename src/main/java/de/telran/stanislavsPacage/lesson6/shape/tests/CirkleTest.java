package de.telran.stanislavsPacage.lesson6.shape.tests;

import de.telran.stanislavsPacage.lesson6.shape.entity.Circle;

public class CirkleTest {
    public static void main(String[] args) {
        int radius = 10;

        String title = "Circle";
       Circle circle = new Circle(title, radius);

        double expertedAreaResult = Math.PI * 100;
        double realAreaResult = circle.calculateArea();
        double expertedPerimetr = Math.PI * 20;
        double realPerimeterResult = circle.calculatePerimeter();

        printTestResult("Cirkle calculate area", expertedAreaResult,realAreaResult);
        printTestResult("Cirkle calculate perimeter", expertedPerimetr,realPerimeterResult);

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
