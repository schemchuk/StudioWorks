package de.telran.stanislavsPacage.lesson3;

public class twoDimArray {
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][3];
        int[][] twoDimArray = {{1,2,3},{5,6},{7},{8,9,10}};

        int count = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                count++;
                twoDArray[i][j] = count;
                System.out.print(twoDArray[i][j] + ", ");

            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                count++;

                System.out.print(twoDimArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
