package de.telran.sammary.testing;

import org.junit.Test;

import static de.telran.sammary.testing.Main.findMax;

public class MeinTest {

    @Test
    public void findMaxTest() {
        int[] arr = {2,3,4,5,6,7, -1};
        int max = findMax(arr);
    }
}
