package de.telran.grogAlgorytm._16_01_24;

public class Simple {
    public class MergeSortedArrays {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6, 8, 10};

            int[] mergedArray = mergeArrays(arr1, arr2);

            // Вывод объединенного массива
            System.out.print("Merged Array: ");
            for (int num : mergedArray) {
                System.out.print(num + " ");
            }
        }

        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int[] mergedArray = new int[len1 + len2];

            int i = 0, j = 0, k = 0;

            // Объединение массивов
            while (i < len1 && j < len2) {
                if (arr1[i] < arr2[j]) {
                    mergedArray[k++] = arr1[i++];
                } else {
                    mergedArray[k++] = arr2[j++];
                }
            }

            // Добавление оставшихся элементов из arr1 (если есть)
            while (i < len1) {
                mergedArray[k++] = arr1[i++];
            }

            // Добавление оставшихся элементов из arr2 (если есть)
            while (j < len2) {
                mergedArray[k++] = arr2[j++];
            }

            return mergedArray;
        }
    }

}

