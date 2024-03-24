package de.telran.extraHomeWorke.collection.extra5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList);

        Book bookNotInTheList = new Book("A3","B3");
        boolean notContainsBook = books.contains(bookNotInTheList);


        System.out.println(books);
        System.out.println(containsBook);
        System.out.println(notContainsBook);


    }
}
