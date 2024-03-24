package de.telran.extraHomeWorke.collection.extra6_7;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase{
    private ArrayList<Book> books;

    private long nextId ;



    public BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.nextId = 1;

    }

    @Override
    public Long save(Book book) {
        book.setId(nextId);
        books.add(book);
        return nextId++;
    }


    @Override
    public boolean delete(Long bookId) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == bookId) {  // не пpоходить equals
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                ", nextId=" + nextId +
                '}';
    }
}
