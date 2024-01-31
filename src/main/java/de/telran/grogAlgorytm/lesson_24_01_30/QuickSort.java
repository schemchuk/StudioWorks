package de.telran.grogAlgorytm.lesson_24_01_30;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 5, 3};
        quickSort(arr, 0, arr.length - 1);

        // Вывод отсортированного массива
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Находим опорный элемент, так чтобы элементы меньше опорного были слева, а больше - справа
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части относительно опорного элемента
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            // Поиск элемента, большего чем опорный, слева
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            // Поиск элемента, меньшего чем опорный, справа
            while (i <= j && arr[j] > pivot) {
                j--;
            }

            // Если найдены такие элементы, меняем их местами
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Помещаем опорный элемент на его окончательное место
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        // Возвращаем индекс опорного элемента
        return j;
    }
}
