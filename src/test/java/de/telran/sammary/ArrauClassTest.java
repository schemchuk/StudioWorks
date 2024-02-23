package de.telran.sammary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static de.telran.sammary.testing.ArrauClass.isAddElement;
import static org.junit.jupiter.api.Assertions.*;

class ArrauClassTest {
    @Test
    public void isAddElementTrueTest() {
        List<Integer> arrList = new ArrayList<>(List.of(2,4,6,-2));
        assertTrue(isAddElement(arrList, 0));

    }
    @Test
    public void isAddElementFalseTest() {
        List<Integer> arrList = new ArrayList<>(List.of(2,4,6,-2,0));
        assertFalse(isAddElement(arrList, 3));
    }

}