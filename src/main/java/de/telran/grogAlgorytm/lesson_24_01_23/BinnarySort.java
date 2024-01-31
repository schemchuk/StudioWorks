package de.telran.grogAlgorytm.lesson_24_01_23;

public class BinnarySort {


        public static void sortBinaryArray(int[] arr) {
            int countZeros = 0;

            // Подсчитываем количество нулей в массиве
            for (int num : arr) {
                if (num == 0) {
                    countZeros++;
                }
            }

            // Заполняем отсортированный массив
            int index = 0;
            for (int i = 0; i < countZeros; i++) {
                arr[index++] = 0;
            }
            for (int i = 0; i < arr.length - countZeros; i++) {
                arr[index++] = 1;
            }
        }

        public static void main(String[] args) {
            int[] binaryArray = {1, 0, 1, 0, 1, 1, 0, 0};

            System.out.println("Исходный массив:");
            for (int num : binaryArray) {
                System.out.print(num + " ");
            }

            sortBinaryArray(binaryArray);

            System.out.println("\nОтсортированный массив:");
            for (int num : binaryArray) {
                System.out.print(num + " ");
            }
        }
    }


