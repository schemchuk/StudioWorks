package de.telran.grogAlgorytm._16_01_24;

public class Hanoj {

        public static void main(String[] args) {
            System.out.println(H(4, "A", "C", "B"));
        }

        public static String H(int n, String A, String C, String B) {
            if (n == 1) return A + C + " ";
            return H(n - 1, A, B, C) + A + C + " " + H(n - 1, B, C, A);
        }
    }

