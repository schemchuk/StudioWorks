package de.telran.extraHomeWorke.collection.extra15.bookDatabaseImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private ArrayList<Book> books;

    private long nextId;


    public BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.nextId = 1;

    }

//    @Override
//    public List<Book> findWithPaging(SearchCriteria searchCriteria, int pageNumber, int pageSize) {
//
//        List<Book> matchinBooks = new ArrayList<>();
//
//        List<Book> allMatchingBooks = find(searchCriteria);
//        int startIndex = (pageNumber - 1) * pageSize;
//        int endIndex = Math.min(startIndex + pageSize, allMatchingBooks.size());
//
//        if (startIndex >= allMatchingBooks.size()) {
//            return matchinBooks;
//        }
//
//        for (int i = startIndex; i < endIndex; i++){
//            matchinBooks.add(allMatchingBooks.get(i));
//        }
//
//        return matchinBooks;
//    }

    @Override
    public List<Book> findWithPaging(SearchCriteria searchCriteria, int pageNumber, int pageSize) {
        // Проверяем, что searchCriteria не равен null
        if (searchCriteria == null) {
            throw new IllegalArgumentException("Search criteria cannot be null");
        }

        // Устанавливаем параметры пейджинга
//        int startIndex = (pageNumber - 1) * pageSize;
//        int endIndex = startIndex + pageSize;
        int fromIndex = (pageNumber - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, books.size());

        // Получаем список всех книг, которые соответствуют критериям поиска
//        List<Book> matchingBooks = find(searchCriteria);
        List<Book> page = books.subList(fromIndex, toIndex);

        // Обрезаем список книг с учетом пейджинга
        return page;

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
    public boolean delete(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            if (currentBook.equals(book)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId() == (bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findBooksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                findBooksByAuthor.add(book);
            }
        }
        return findBooksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> findBooksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title))
                findBooksByTitle.add(book);
        }
        return findBooksByTitle;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (Book book : books) {
            count++;
        }
        return count;
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equals(author)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books){
            if (searchCriteria.match(book)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> unigAuthors = new HashSet<>();
        for (Book book : books) {
            unigAuthors.add(book.getAuthor());
        }
        return unigAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : books){
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {

        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBookMap = new HashMap<>();
        for (Book book : books) {

            String author = book.getAuthor();
            List<Book> booksByAuthor = authorToBookMap.get(author);
            if (booksByAuthor == null) {
                booksByAuthor = new ArrayList<>();
                authorToBookMap.put(author, booksByAuthor);
            }
          booksByAuthor.add(book);
        }
        return authorToBookMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String,Integer> authorToBookCountMap = new HashMap<>();

        for (Book book : books) {
            String author  = book.getAuthor();
            authorToBookCountMap.put(author,authorToBookCountMap.getOrDefault(author,0) + 1);

        }
        return authorToBookCountMap;
    }


    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                ", nextId=" + nextId +
                '}';
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}




