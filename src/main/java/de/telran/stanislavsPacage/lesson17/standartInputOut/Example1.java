package de.telran.stanislavsPacage.lesson17.standartInputOut;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Пример с переносом строк");
        System.out.printf("one%ntwo%nthree");
        System.out.println();

        System.out.println("пример с логическим типом");
        System.out.printf("%b%n", null);
        System.out.printf("%B%n",false);
        System.out.printf("%B%n", 2);
        System.out.printf("%b%n", "text");
        System.out.println();

        System.out.println("Пример с текстовыми данными");
        System.out.printf("%50.20s", "Hello World");
        System.out.println();

        System.out.println("Пример с символами");
        System.out.printf("%c%n", 'a');
        System.out.printf("%C%n", 'a');
        System.out.println("");
        int x = 100;

        System.out.printf("Print simple integer: x = %d\n", x);
        System.out.printf("Formated to specifik width: n = %.6f\n" , Math.PI);

        float y = 3.14f;
        System.out.printf("Formated to specifik width: n = %.4f\n" , y);


//        DecimalFormat df = new DecimalFormat("#.####");
//        y = 1234567.3156f;
        y = 1234556.32f;
        System.out.printf("Formated to specifik width: n = %50.4f\n" , y);

        System.out.println();

        System.out.println("Пример с датой");
        Date date = new Date();

        System.out.println(date);

        // Символы H, M, S отвечают за часы, минуты и секунда

        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);

        /*
        A  - выводит полный день недели
        d  - форматирует двузначный день месяца
        B  - для полного названия месяца
        m  - форматирует двузначный месяц
        Y  - выводи год в виде четырех цифр
        y  - выводи две последние цифры года

         */


    }
}
