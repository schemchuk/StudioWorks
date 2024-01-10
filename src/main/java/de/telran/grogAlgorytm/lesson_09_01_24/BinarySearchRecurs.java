package de.telran.grogAlgorytm.lesson_09_01_24;

public class BinarySearchRecurs {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int nun = 30;
        int result = recursiveBinarySearch(arr,nun,0, arr.length - 1);

        if (result == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на позиции " + result);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int num, int left, int right){
        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == num){
                return num;
            }

            if (arr[mid] < num){
                return recursiveBinarySearch(arr,num,mid + 1, right);
            } else {
                return recursiveBinarySearch(arr,num,left,mid - 1);
            }
        }
        return  -1;
    }
}
