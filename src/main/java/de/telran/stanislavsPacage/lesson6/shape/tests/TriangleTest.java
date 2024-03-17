package de.telran.stanislavsPacage.lesson6.shape.tests;

import de.telran.stanislavsPacage.lesson6.shape.entity.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        int sideA = 10;

        String title = "Triangle";
        Triangle triangle = new Triangle(title, sideA);

        double expertedAreaResult = 43.30127018922193;
        double realAreaResult = triangle.calculateArea();
        double expertedPerimetr = 30;
        double realPerimeterResult = triangle.calculatePerimeter();

        printTestResult("Triangle calculate area", expertedAreaResult,realAreaResult);
        printTestResult("Triangle calculate perimeter", expertedPerimetr,realPerimeterResult);
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
