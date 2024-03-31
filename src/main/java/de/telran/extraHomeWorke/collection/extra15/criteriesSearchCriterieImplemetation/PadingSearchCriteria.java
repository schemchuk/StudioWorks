package de.telran.extraHomeWorke.collection.extra15.criteriesSearchCriterieImplemetation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

public class PadingSearchCriteria implements SearchCriteria {
    private int pageNumber;
    private int pageSize;

    public PadingSearchCriteria(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    @Override
    public boolean match(Book book) {
        if (book.getAuthor() == null || book.getTitle() == null) {
            return false;
        }

        int index = (pageNumber -1) * pageSize;
        return index <= book.getId() && book.getId() < index + pageSize;
    }
}
