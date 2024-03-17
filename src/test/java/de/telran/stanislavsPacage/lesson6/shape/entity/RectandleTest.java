package de.telran.stanislavsPacage.lesson6.shape.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectandleTest {

    Rectandle rectandle = new Rectandle("Restandle", 10,20);
    @Test
    void calculateArea() {
        double expertedAreaResult = 200;
        double realAreaResult = rectandle.calculateArea();


        assertEquals(expertedAreaResult, realAreaResult);
    }

    @Test
    void calculatePerimeter() {

        double expertedPerimetr = 60;
        double realPerimeterResult = rectandle.calculatePerimeter();

        assertEquals(expertedPerimetr, realPerimeterResult);
    }
}