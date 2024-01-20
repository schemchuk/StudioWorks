package de.telran._JavaProStudio.module5.lesson2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleCalendar {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar();
        System.out.println(calendar1);
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2);

        Calendar calendar3 = new GregorianCalendar(2022, Calendar.JULY, 25);
       int a = calendar3.get(Calendar.MONTH);
        System.out.println(a);

        calendar3.set(Calendar.MINUTE, 50);
        System.out.println(calendar3.get(Calendar.MINUTE));

        calendar3.add(Calendar.MONTH, 2);
        System.out.println(calendar3.get(Calendar.MONTH));

        System.out.println("--------------------------");

        // Format String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println(dateStr);

        // use Calendar



    }
}
