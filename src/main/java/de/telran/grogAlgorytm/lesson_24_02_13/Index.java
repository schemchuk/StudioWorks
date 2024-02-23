package de.telran.grogAlgorytm.lesson_24_02_13;

import java.util.Arrays;

public class Index {
    public static void main(String[] args)
    {
        int[] A = { 10, 20, 60, 50, 40, 30, 70, 80, 90 };
        findIndices(A);
    }
    public static void findIndices(int[] A)
    {
        int leftIndex = -1, rightIndex = -1;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++)
        {
            if (max_so_far < A[i]) {
                max_so_far = A[i];
            }

            if (A[i] < max_so_far) {
                rightIndex = i;
            }
        }

        int min_so_far = Integer.MAX_VALUE;
        for (int i = A.length - 1; i >= 0; i--)
        {
            if (min_so_far > A[i]) {
                min_so_far = A[i];
            }

            if (A[i] > min_so_far) {
                leftIndex = i;
            }
        }
        System.out.print( leftIndex + "," + rightIndex);
    }
}





