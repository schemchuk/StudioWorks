package de.telran.javaPro.lections.lesson_24_03_18;

import java.util.Arrays;

public class BookShop {
    public static void main(String[] args) {
        Book book1 = new Book("Harry witn Porter 1", "Ravling", 20, true);
        Book book2 = new Book("Harry witn Porter 2", "Ravling", 20, true);
        Book book3 = new Book("Harry witn Porter 3", "Ravling", 20, true);
        Book book4 = new Book("Harry witn Porter 4", "Ravling", 20, true);
        Book book5 = new Book("Harry witn Porter 5", "Ravling", 20, true);

        Arrays.asList(book1,book2,book3,book4,book5);

       // Collections.sort((bookList));
    }
}
