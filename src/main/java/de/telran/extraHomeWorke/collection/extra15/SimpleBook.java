package de.telran.extraHomeWorke.collection.extra15;

import de.telran.extraHomeWorke.collection.extra15.bookDatabaseImplementation.BookDatabaseImpl;
import de.telran.extraHomeWorke.collection.extra15.emptity.Book;

import java.util.List;
import java.util.Map;

public class SimpleBook {
    public static void main(String[] args) {
        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book(1,"Title1", "Author1" );
        Book book2 = new Book(4,"Title2", "Author2" );
        Book book3 = new Book(5,"Title3", "Author2" );
        Book book4 = new Book(6,"Title4", "Author2" );
        Book book5 = new Book(9, "Title2","Author3");
        Book book6 = new Book(8, "Title2","Author4");
        Book book7 = new Book(7, "Faust", "Goethes");
        Book book8 = new Book(10, "Egmont", "Goethes");
        Book book9 = new Book(11, "Kateryna", "Shewchenko");
        Book book10 = new Book(12, "1984", "George Orwell");
        Book book11 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book12 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald");

        long id1 = database.save(book1);
        long id2 =  database.save(book2);
        long id3 =  database.save(book3);
        long id4 =  database.save(book4);
        long id5 =  database.save(book5);
        long id6 =  database.save(book6);
        database.save(book7);
        database.save(book8);
        database.save(book9);
        database.save(book10);
        database.save(book11);
        database.save(book12);

      //  System.out.println(database);

//        System.out.println(database.delete(id1));
//        System.out.println(database.delete(id1));

//        System.out.println(database.delete(book1));
//        System.out.println(database.delete(book1));
//
//        System.out.println(database.findById(1L));
//        System.out.println(database.findById(2L));
//        System.out.println(database);
//
//        System.out.println(database.findByAuthor("Author2"));
//        System.out.println(database.findByAuthor("Author3"));

//        System.out.println(database.findByTitle("Title2"));
//        System.out.println(database.findByTitle("Sraka"));

      //  System.out.println("В базе находится " + database.countAllBooks() + " книг");

//        System.out.println("Список книг до удаления: " + database);
//
//        database.deleteByAuthor("Author2");
//        System.out.println("Список книг после удаления: " + database);

//        System.out.println("Список книг до удаления: " + database);
//
 //       database.deleteByTitle("Title2");
//        System.out.println("Список книг после удаления: " + database);

//        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Goethes");
//        System.out.println("Книга автора Goethes " + authorSearchCriteria.match(book8));
//
//        AuthorSearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Author8");
//        System.out.println("Книга автора Author8 " + authorSearchCriteria1.match(book1));
//
//        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Faust");
//        System.out.println("Книга под названием Faust: " + titleSearchCriteria.match(book7) );
//        System.out.println("Книга под названием Faust: " + titleSearchCriteria.match(book8) );

//        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Goethes");
//        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Faust");
//        AndSearchCriteria combinedAndCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
//        Book book13 = new Book(7,"Faust" ,"Goethes");
//
//        System.out.println("Book 1 matches combined criteria: " + combinedAndCriteria.match(book7));
//
//        OrSearchCriteria combinedOrCriteria = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
//        Book book14 = new Book(7,"Sraka" ,"Goethes");
//
//        System.out.println("Book 1 matches combined criteria: " + combinedOrCriteria.match(book7));

//        System.out.println("В базе находится " + database.countAllBooks() + " книг");
//
//        SearchCriteria authorCriteria = new AuthorSearchCriteria("Goethes");
//        SearchCriteria titleCriteria = new TitleSearchCriteria("Faust");

//        List<Book> matchingBooks = database.find(new AndSearchCriteria(authorCriteria,titleCriteria));
//        System.out.println("Найденные книги: " + matchingBooks);
//        System.out.println("-------------");
//
//        List<Book> matchingBooks1 = database.find(new OrSearchCriteria(authorCriteria,titleCriteria));
//        System.out.println("Найденные книги: " + matchingBooks1);
//
//        Set<String> uniqueAuthors = database.findUniqueAuthors();
//        System.out.println("Уникальные авторы: " + uniqueAuthors);
//
//        Set<String> uniqueTitles = database.findUniqueTitles();
//        System.out.println("Уникальные Названия книг: " + uniqueTitles);
//
//        Set<Book> uniqueBooks = database.findUniqueBooks();
//        System.out.println("Уникальные  книгu: " + uniqueBooks);
//
//        Book bookToCheck1 = new Book(1,"Faust","Goethes");
//        Book bookToCheck2 = new Book(7,"Faust","Goethes");
//        boolean bookExist1 = database.contains(bookToCheck1);
//        boolean bookExist2 = database.contains(bookToCheck2);
//        System.out.println("Книга уже существует в базе данных: " + bookExist1);
//        System.out.println("Книга уже существует в базе данных: " + bookExist2);

        Map<String, List<Book>> authorToBooksMap = database.getAuthorToBooksMap();

        for (Map.Entry<String, List<Book>> entry : authorToBooksMap.entrySet()){
            String author = entry.getKey();
            List<Book> books = entry.getValue();

            System.out.println("Автор: " + author);
            System.out.println("Книги: " + books);
            System.out.println();
        }

    }
}
