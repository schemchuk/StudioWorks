package de.telran.grogAlgorytm.lesson3;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(progression(6));
        System.out.println(withautRecurcion(6));
        System.out.println(fibonachi(3));
        System.out.println(witoutRecursionFibonachi(2));
        System.out.println(Fibonacci(1));

        System.out.println("---------------------------------------");


        int[] array = {1, 2, 3, 4, 5, 9, 12};
        int number = 12;
        if (binarySearch(array, number) == -1) System.out.println("the number you're looking for is not here");
        else System.out.println(binarySearch(array, number));

        System.out.println("------------------------------------");

        int[] arr = {1,2,3,4,5,9,12};
        int num = 12;
        if (binarySearch(array,number,0,arr.length-1)==-1) System.out.println("the number you're looking for is not here");
        else System.out.println(binarySearch(arr,num,0,arr.length-1));
    }

    public static int progression(int n) {
        if (n <= 0) throw new Error("the number should be positive");
        if (n == 1) return 1;
        return progression(n - 1) + n;
    }

    public static int withautRecurcion(int n) {

        if (n <= 0) throw new Error("the number should be positive");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int fibonachi(int n) {

        if (n <= 0) throw new Error("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);


    }

    public static int witoutRecursionFibonachi(int n) {

        if (n <= 0) throw new Error("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        int item1 = 0;
        int item2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = item1 + item2;
            item1 = item2;
            item2 = sum;
        }
        return sum;
    }

    public static int Fibonacci(int n) {
        if (n <= 0) throw new Error("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        int item1 = 0;
        int item2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = item1 + item2;
            item1 = item2;
            item2 = sum;
        }
        return sum;
    }

    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (num > arr[mid]) {
                start = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else return mid;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int num, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (num > arr[mid]) {
            return binarySearch(arr, num, mid + 1, end);
        } else if (num < arr[mid]) {
            return binarySearch(arr, num, start, mid - 1);
        } else return mid;
    }
}






