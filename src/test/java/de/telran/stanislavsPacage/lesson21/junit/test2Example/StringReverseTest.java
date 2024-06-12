package de.telran.stanislavsPacage.lesson21.junit.test2Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    StringReverse stringReverse = new StringReverse();



    @Test
    void reverseWord() {
        String testString = " ABBA sing sond";

        String expectedResult = "ABBA gnis dnos";
        String actualResult = stringReverse.reverseWord(testString);
        assertEquals(expectedResult, actualResult);
    }
}