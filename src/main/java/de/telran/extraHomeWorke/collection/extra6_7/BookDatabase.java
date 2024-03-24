package de.telran.extraHomeWorke.collection.extra6_7;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
