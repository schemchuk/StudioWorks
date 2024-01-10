package de.telran.grogAlgorytm.lesson_09_01_24;

public class BinaruSearccWithDavid {

        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
            int number = 80;
            int result = binarySearch(array, number,0,array.length);
            if (result==-1)
                System.out.println("The number you're looking for is not here");
            else
                System.out.println(result);
        }
        public static int binarySearch(int[] arr, int num,int start,int end) {
            if (start > end) return -1;
            int mid = (start + end) / 2;
            if (num > arr[mid]) return binarySearch(arr, num, mid + 1, end);
            else if (num < arr[mid]) return binarySearch(arr, num, start, mid - 1);
            else return mid;
        }
    }

