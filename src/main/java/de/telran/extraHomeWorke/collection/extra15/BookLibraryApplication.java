package de.telran.extraHomeWorke.collection.extra15;

import de.telran.extraHomeWorke.collection.extra15.bookDatabaseImplementation.BookDatabaseImpl;
import de.telran.extraHomeWorke.collection.extra15.criteriesSearchCriterieImplemetation.PadingSearchCriteria;
import de.telran.extraHomeWorke.collection.extra15.emptity.Book;

import java.util.List;

public class BookLibraryApplication {
    public static void main(String[] args) {

       BookDatabaseImpl database = new BookDatabaseImpl();




   //     BookLibrary bookLibrary = new BookLibrary();
//        bookLibrary.run();

        int pageNumber = 1;
        int pageSize = 5;

        PadingSearchCriteria pagingCriteria = new PadingSearchCriteria(pageNumber, pageSize);
        List<Book> books = database.findWithPaging(pagingCriteria, pageNumber, pageSize);

        Book books1 = new Book(1,"Title1", "Author1" );
        Book books2 = new Book(4,"Title2", "Author2" );
        Book books3 = new Book(5,"Title3", "Author2" );
        Book books4 = new Book(6,"Title4", "Author2" );
        Book books5 = new Book(9, "Title2","Author3");
        Book books6 = new Book(8, "Title2","Author4");
        Book books7 = new Book(7, "Faust", "Goethes");
        Book books8 = new Book(10, "Egmont", "Goethes");
        Book books9 = new Book(11, "Kateryna", "Shewchenko");
        Book books10 = new Book(12, "1984", "George Orwell");
        Book books11 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book books12 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald");


        books.add(books1);
        books.add(books2);
        books.add(books3);
        books.add(books4);


;

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
