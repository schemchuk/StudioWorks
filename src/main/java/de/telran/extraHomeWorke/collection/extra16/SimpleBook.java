package de.telran.extraHomeWorke.collection.extra16;

import de.telran.extraHomeWorke.collection.extra15.AuthorSearchCriteria;

public class SimpleBook {
    public static void main(String[] args) {
//        BookDatabaseImpl database = new BookDatabaseImpl();
        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book(1, "Title1", "Author1");
        Book book2 = new Book(1, "Title2", "Author2");
        Book book3 = new Book(1, "Title3", "Author2");
        Book book4 = new Book(1, "Title4", "Author2");
        Book book5 = new Book(1, "Title2", "Author3");
        Book book6 = new Book(1, "Title2", "Author4");
        Book book7 = new Book(1, "Faust", "Goethes");
        Book book8 = new Book(1, "Egmont", "Goethes");
        Book book9 = new Book(1, "Kateryna", "Shewchenko");
        Book book10 = new Book(1, "1984", "George Orwell");
        Book book11 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book12 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald");


        long id1 = database.save(book1);
        long id2 = database.save(book2);
        long id3 = database.save(book3);
        long id4 = database.save(book4);
        long id5 = database.save(book5);
        long id6 = database.save(book6);
        long id7 = database.save(book7);
        long id8 = database.save(book8);
        long id9 = database.save(book9);
        database.save(book10);
        database.save(book11);
        database.save(book12);

        System.out.println(database);

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

        //System.out.println("В базе находится " + database.countAllBooks() + " книг");

//        System.out.println("Список книг до удаления: " + database);
//
//        database.deleteByAuthor("Author2");
//        System.out.println("Список книг после удаления: " + database);

//        System.out.println("Список книг до удаления: " + database);
//
//        database.deleteByTitle("Title2");
//        System.out.println("Список книг после удаления: " + database);

        //________________________________________________________________________


        /

        // Создаем объекты AuthorSearchCriteria для различных авторов
        AuthorSearchCriteria criteria1 = new AuthorSearchCriteria("George Orwell");


        System.out.println("В базе находится " + database.countAllBooks() + " книг");

        // Проверяем соответствие критериям поиска
        System.out.println("Book 1 matches criteria 1: " + criteria1.match(new de.telran.extraHomeWorke.collection.extra15.Book(1, "1984", "George Orwell"))); // true
//        System.out.println("Book 2 matches criteria 2: " + criteria2.match(book8)); // true
//        System.out.println("Book 3 matches criteria 3: " + criteria3.match(book9)); // false

        AuthorSearchCriteria searchCriteria = new AuthorSearchCriteria("Goethes");

        System.out.println("Book 2 matches criteria 2: " + searchCriteria.match(book8));
    }
}

