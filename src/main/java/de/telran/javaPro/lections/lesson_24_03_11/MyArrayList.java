package de.telran.javaPro.lections.lesson_24_03_11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<String>{

    private String[] data;

    public MyArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {

        return new MyArrayListIterator();
    }

    public class MyArrayListIterator implements Iterator<String> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {

            return currentIndex < data.length;
        }

        @Override
        public String next() {
            if (!hasNext()){
                throw new NoSuchElementException("No elements");
            }
            String current = data[currentIndex++];
            return current;
        }
    }
}
