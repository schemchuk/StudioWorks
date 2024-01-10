package de.telran.grogAlgorytm.lesson_09_01_24;

public class SimplRecursionFibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(4));
    }

    public static int fibonachi(int n) {

        if (n <= 0) throw new Error("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
