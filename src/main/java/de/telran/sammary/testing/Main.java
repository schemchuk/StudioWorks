package de.telran.sammary.testing;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {


    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i =1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void getTime() {

        Timestamp start = Timestamp.from(Instant.now());
    }
}
