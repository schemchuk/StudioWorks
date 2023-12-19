package de.telran.grogAlgorytm.lesson3;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,12};
        int number = 8;
        if (binarySearch(array,number,0,array.length-1)==-1) System.out.println("the number you're looking for is not here");
        else System.out.println(binarySearch(array,number,0,array.length-1));

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
