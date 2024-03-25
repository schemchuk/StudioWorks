package de.telran.extraHomeWorke.collection.extra15.criteriesSearchCriterieImplemetation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearSearchCriteria(1890);

        SearchCriteria condition1 = new AndSearchCriteria(authorCriteria,titleCriteria);
        System.out.println("Условие 1: " + condition1.match(new Book(15,"Zveroboi", "Kuper")));
    }

}
