package de.telran.extraHomeWorke.collection.extra15.criteriesSearchCriterieImplemetation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

public class YearSearchCriteria implements SearchCriteria {
    private int yearCriteria;

    public YearSearchCriteria(int yearCriteria) {
        this.yearCriteria = yearCriteria;
    }

    public int getYearCriteria() {
        return yearCriteria;
    }


    @Override
    public boolean match(Book book) {
        return false;
    }
}
