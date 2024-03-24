package de.telran.extraHomeWorke.collection.extra15.criteriesToSearch;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {

        if (book.getAuthor().equals(authorToSearch)){
            return true;
        }
        return false;
    }

}
