package de.telran.hexlet.module1;

import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> implements Collection<T> {

    private T[] m = (T[]) new Object[1];

    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(final Object o) {
        for (int i = 0; i < size; i++) {
            if (m[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    @Override
    public Object[] toArray() {
        final T[] newM = (T[]) new Object[this.size()];
        System.arraycopy(m, 0, newM, 0, this.size());
        return newM;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) this.toArray();
    }

    @Override
    public boolean add(final T t) {
        if (m.length == size) {
            final T[] oldM = m;
            m = (T[]) new Object[this.size() * 2];
            System.arraycopy(oldM, 0, m, 0, oldM.length);
        }
        m[size++] = t;
        return true;
    }

    @Override
    public boolean remove(final Object o) {
        for (int i = 0; i < size(); i++) {
            if (m[i].equals(o) && i != this.size() - 1) {
                System.arraycopy(m, i + 1, m, i, this.size() - i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private class ElementsIterator implements Iterator<T> {

        private int size;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > size;
        }

        @Override
        public T next() {
            return ArrayCollection.this.m[size++];
        }

    }
}



