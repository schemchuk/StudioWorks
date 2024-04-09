package de.telran.algorytm.lesson11;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int result = main.factorial(2);
        System.out.println(result);
    }

    //    private int fact(int n) {
//        if (n < 0) {
//            System.out.println("Зачем тебе факториал из отрицательного числа?");
//            return 0;
//        }
//        int result = 1;
//        if (n == 0) {
//            return result;
//        }
//        for (int i = 1; i <= n; i++) {
//            result = result * i;
//        }
//        return result;
//    }
    private int factorial(int n) {
        if (n < 0) {
            System.out.println("Зачем тебе факториал отрицательного числа?");
            return 0;
        }
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}




