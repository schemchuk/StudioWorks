package de.telran.abracadabra.collection.testPac;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class FindCommonElementsTest {
    @Test
    public void testfindCommonElements() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        List<Integer> expected = List.of(1, 7);

        List<Integer> result = FindCommondElements.findCommonElements(array1, array2);

        assertEquals(expected, result);
    }
}
