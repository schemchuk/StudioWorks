package de.telran._JavaProStudio.module5.lesson2;

import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current dat is: " + date);

        Date date2 = new Date(33848746590765433L);
        System.out.println("Our date is: " + date2);

//        Date date3 = new Date(2024,01, 19);
//        System.out.println("Our date is: " + date3);
        boolean f1 = date.after(date2);
        System.out.println(f1);


        boolean f2 = date.before(date2);
        System.out.println(f2);

        int compare = date.compareTo(date2);
        System.out.println(compare);

        System.out.println("Time in milisecond is: " + date.getTime());

        // CALENDER


    }
}
