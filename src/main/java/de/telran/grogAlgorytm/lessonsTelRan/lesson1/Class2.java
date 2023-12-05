package de.telran.grogAlgorytm.lessonsTelRan.lesson1;

public class Class2 {


    public static void main(String[] args) {

        int[] array = {0, 10, 20, 30, 40, 50};
        findSummPaar(array, 40);

    }

    public static void findSummPaar(int[] array, int targetSumm){
            for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSumm)
                    System.out.println("i=" + array[i] + " j=" + array[j]);
            }
        }
    }
}

