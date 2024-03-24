package de.telran.extraHomeWorke.collection.extra16;

import de.telran.extraHomeWorke.collection.extra15.Book;

public interface SearchCriteria {
    boolean match(Book book);
}
