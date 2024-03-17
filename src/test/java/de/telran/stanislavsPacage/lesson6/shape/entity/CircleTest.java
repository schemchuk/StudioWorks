package de.telran.stanislavsPacage.lesson6.shape.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle("Cirkle", 10);

    @Test
    void calculateArea() {
        double expertedAreaResult = Math.PI * 100;
        double realAreaResult = circle.calculateArea();
        assertEquals(expertedAreaResult, realAreaResult);

    }

    @Test
    void calculatePerimeter() {
        double expertedPerimetr = Math.PI * 20;
        double realPerimeterResult = circle.calculatePerimeter();
        assertEquals(expertedPerimetr, realPerimeterResult);
    }
}