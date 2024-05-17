package de.telran.stanislavsPacage.lesson21.dateAndTime;

import java.util.Date;

public class Date2Example {
    public static void main(String[] args) {

        Date date1 = new Date(100,11, 21);
        Date date2 = new Date();
        Date date3 = new Date(110, 1, 3);

        System.out.println("Current date1 is: " + date1);
        System.out.println("Current date2 is: " + date2);
        System.out.println("Current date3 is: " + date3);

        boolean isAfter = date3.after(date2);
        System.out.println("Date + " + date3 + " comes after:" + date2 + " is " +  isAfter);

        isAfter = date3.after(date1);

        System.out.println("Date + " + date3 + " comes after:" + date1 + " is " +  isAfter);

        int millis = date1.compareTo(date2);
        System.out.println(millis);

        System.out.println("Milliseconds from 1 Jan 1970 to date " + date2 + " is " + date2.getTime());
    }

}
