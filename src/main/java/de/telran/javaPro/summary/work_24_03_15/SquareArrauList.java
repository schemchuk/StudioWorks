package de.telran.javaPro.summary.work_24_03_15;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SquareArrauList implements Iterable<Integer> {
    private int[][] data;

    public SquareArrauList(int[][] data) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "SquareArrauList{" +
                "data=" + Arrays.deepToString(data) +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SquareListIterator();
    }

    private class SquareListIterator implements Iterator<Integer> {
        int row = 0;
        int col = 0;

        @Override
        public boolean hasNext() {
            return row < data.length && col < data[row].length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int value = data[row][col++];
            if (col >= data[row].length) {
                col = 0;
                row++;
            }
            return value;
        }
    }
}




