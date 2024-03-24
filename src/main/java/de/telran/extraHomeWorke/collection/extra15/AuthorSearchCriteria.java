package de.telran.extraHomeWorke.collection.extra15;
public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {

        return book.getAuthor().equals(authorToSearch);
    }
}
