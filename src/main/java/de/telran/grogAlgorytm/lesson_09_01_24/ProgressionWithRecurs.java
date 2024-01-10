package de.telran.grogAlgorytm.lesson_09_01_24;

public class ProgressionWithRecurs {
    public static void main(String[] args) {
        System.out.println(S(5));
    }



        public static int S(int n) {
            if (n <= 0) throw new Error("the number should be positive");
            if (n == 1) return n;
            return S(n - 1) + n;
        }
        }


