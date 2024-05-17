package de.telran.javaPro.lections.lesson_24_05_13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getFirstDayOfWeek());
    }
}
