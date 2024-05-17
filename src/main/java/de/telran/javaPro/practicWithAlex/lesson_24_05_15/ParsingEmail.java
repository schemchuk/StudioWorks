package de.telran.javaPro.practicWithAlex.lesson_24_05_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingEmail {
    /**
     * 1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
     */
    public static void main(String[] args) {

        String email = "my_25@domen-38.de";
        String regex = "a-zA-Z";
        String regex1 = "^[a-z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-z]{2}";

        //  1-й вариант
        Pattern emailPattern = Pattern.compile("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$");
        Matcher emailMatcher = emailPattern.matcher("my_25@domen-38.de");
        boolean emailMatch = emailMatcher.matches();
        System.out.println("Your e-mail matches requirements: " + emailMatch);

        //  2-й вариант
        boolean emailMatch1 = Pattern.matches("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$", "my_25@domen-38.de");
        System.out.println("Your e-mail matches requirements: " + emailMatch1);

//  3-й вариант
        String email1 = "my_25@domen-38.de";
        boolean emailMatch2 = email1.matches("^[^_[.]-][\\w-]+([.][\\w-]+)*@[-\\w&&[^_]]{3,20}([.][a-zA-Z]{2,7})?[.][a-zA-Z]{2,}$");
        System.out.println("Your e-mail matches requirements: " + emailMatch2);
    }
}
