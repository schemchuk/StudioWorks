package de.telran.algorytm.lesson_24_04_30;

import java.util.List;

public class SimpleTree<T> {
    int number;
    List<T> children;

    public SimpleTree(int number, List<T> children) {
        this.number = number;
        this.children = children;
    }
}
