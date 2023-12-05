package de.telran.grogAlgorytm.lessonsTelRan.lesson1;

public class Class {



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {0, 10, 20, 30, 40, 50};
        System.out.println(getMax(arr));
        System.out.println(getmin(arr));
        System.out.println();
        getChet(arr);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == 50)
                    return;





            }
        }
    }



    public static void getChet(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " Четное");
            } else {
                System.out.println(arr[i] + " Нечетное");
            }
        }
    }


    public static  int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

//    public static int[][](){
//
//    }
}


