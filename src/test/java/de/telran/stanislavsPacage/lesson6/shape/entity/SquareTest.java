package de.telran.stanislavsPacage.lesson6.shape.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

Square square =new Square("Square", 10);
    @Test
    void calculateArea() {
        double expertedAreaResult = 100;
        double realAreaResult = square.calculateArea();
        assertEquals(expertedAreaResult, realAreaResult);
    }

    @Test
    void calculatePerimeter() {
        double expertedPerimetr = 40;
        double realPerimeterResult = square.calculatePerimeter();
        assertEquals(expertedPerimetr, realPerimeterResult);
    }
}