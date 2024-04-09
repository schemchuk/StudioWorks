package de.telran.extraHomeWorke.collection.extra15.criteriesSearchCriterieImplemetation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

import java.util.Comparator;

public class SortingSearchKriteria implements SearchCriteria{

    private SearchCriteria originalCriteria;
    private Comparator<Book> comparator;

    public SortingSearchKriteria(SearchCriteria originalCriteria, Comparator<Book> comparator) {
        this.originalCriteria = originalCriteria;
        this.comparator = comparator;
    }

    @Override
    public boolean match(Book book) {
        return originalCriteria.match(book);
    }

    public Comparator<Book> getComparator(){
        return comparator;
    }
}
