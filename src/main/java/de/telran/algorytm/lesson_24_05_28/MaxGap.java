package de.telran.algorytm.lesson_24_05_28;


// написать функцию, которая получает на вход отсортированный массив целых чисел
// и возвращает максимальную разницу между соседними значениями.
// Например:
//
// Input: [2, 6, 7, 11, 14]
// Output: 4 (11-7)
//
// Сначала сделать нерекурсивную версию maxGapIter, затем - рекурсивную maxGapRecursive


public class MaxGap {

    public static int maxGapIter(int[] input) {
        int max = input[0];
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }

        return max - min;
    }

//    public static int maxGapRecursive(int[] input) {
//        return maxGapFrom(input, 0);
//    }

  //  public static int maxGapFrom(int[] input, int from) {
//        if (from >= input.length - 1) {
//            return 0;
//        } else {
//            int curGap = input[from + 1] - input[from];
//            int otherGap = maxGapFrom(input, from + 1); // на остатке массива
//            int bestGap;
//            return bestGap;
//        }

   // }
}

        


