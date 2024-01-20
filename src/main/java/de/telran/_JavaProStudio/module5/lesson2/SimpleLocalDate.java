package de.telran._JavaProStudio.module5.lesson2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class SimpleLocalDate {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        int year = date.getYear();
//        int month = date.getMonthValue();
//
//        int dayOfMonth = date.getDayOfMonth();
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(date);
//        System.out.println(dayOfWeek);
//        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
//
//        date = LocalDate.of(1996, 1, 1);
//
//        date = date.plusYears(4);
//        date = date.plusMonths(3);
//        date = date.plusDays(14);
//        System.out.println(date);
//
//        date = date.minusMonths(10);
//        date = date.minusDays(3);
//        System.out.println(date);

        LocalDate today = LocalDate.now();
        System.out.println("Now is data: " + today);

        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today1 = LocalDate.now(timezone);
        System.out.println( "Today in Shanchai is: " + today1);

        LocalDate date = LocalDate.of(2025, Month.JANUARY, 19);
        System.out.println(date);
        LocalDate date1 = LocalDate.of(2027, 1, 19);
        System.out.println(date1);
    }
}
