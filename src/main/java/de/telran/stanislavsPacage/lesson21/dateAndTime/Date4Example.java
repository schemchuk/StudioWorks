package de.telran.stanislavsPacage.lesson21.dateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Date4Example {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Local time is: " + calendar.getTime());

        TimeZone newTimeZone = TimeZone.getTimeZone( "Asis/Shanghai");

        calendar.setTimeZone(newTimeZone);

        calendar.set(calendar.HOUR_OF_DAY, 24);
        calendar.set(calendar.MINUTE,10);
        calendar.set(calendar.SECOND,30);

        System.out.println("China time = " + calendar.getTime());
    }
}
