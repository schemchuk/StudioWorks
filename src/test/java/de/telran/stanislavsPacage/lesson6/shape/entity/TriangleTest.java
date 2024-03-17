package de.telran.stanislavsPacage.lesson6.shape.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle("Triangle", 10);

    @Test
    void calculateArea() {
        double expertedAreaResult = 43.30127018922193;
        double realAreaResult = triangle.calculateArea();

        assertEquals(expertedAreaResult, realAreaResult);
    }

    @Test
    void calculatePerimeter() {
        double expertedPerimetr = 30;
        double realPerimeterResult = triangle.calculatePerimeter();
        assertEquals(expertedPerimetr, realPerimeterResult);

    }
}