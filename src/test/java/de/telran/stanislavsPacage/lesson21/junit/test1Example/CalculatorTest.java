package de.telran.stanislavsPacage.lesson21.junit.test1Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    int x;
    int y;

    @Test
    void add() {
        x = 5;
        y = 10;
        int exectedResult = 15;
        int actualResult = calculator.add(x,y);

        assertEquals(exectedResult, actualResult);
    }

    @Test
    void multipl() {
        x = 5;
        y = 10;

        int exectedResult = 50;
        int actualResult = calculator.multipl(x,y);

        assertEquals(exectedResult, actualResult);

    }
}