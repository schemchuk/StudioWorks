package de.telran.extraHomeWorke.collection.extra8_14;

public class SimpleBook {
    public static void main(String[] args) {
        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book(1,"Title1", "Author1" );
        Book book2 = new Book(1,"Title2", "Author2" );
        Book book3 = new Book(1,"Title3", "Author2" );
        Book book4 = new Book(1,"Title4", "Author2" );
        Book book5 = new Book(1, "Title2","Author3");
        Book book6 = new Book(1, "Title2","Author4");
//        Book book7 = new Book(1,"Faust", "Goethes");
//        Book book8 = new Book(1, "Egmont", "Goethes");
//        Book book9= new Book(1, "Kateryna", "Shewchenko");

        long id1 = database.save(book1);
        long id2 =  database.save(book2);
        long id3 =  database.save(book3);
        long id4 =  database.save(book4);
        long id5 =  database.save(book5);
        long id6 =  database.save(book6);
//        long id7 =  database.save(book7);
//        long id8 =  database.save(book8);
//        long id9 =  database.save(book9);

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

        System.out.println("В базе находится " + database.countAllBooks() + " книг");

//        System.out.println("Список книг до удаления: " + database);
//
//        database.deleteByAuthor("Author2");
//        System.out.println("Список книг после удаления: " + database);

//        System.out.println("Список книг до удаления: " + database);
//
//        database.deleteByTitle("Title2");
//        System.out.println("Список книг после удаления: " + database);

        //________________________________________________________________________

//        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Goethes");
//        de.telran.extraHomeWorke.collection.extra15.emptity.Book book7 = new de.telran.extraHomeWorke.collection.extra15.emptity.Book(1,"Faust", "Goethes");
//        de.telran.extraHomeWorke.collection.extra15.emptity.Book book8 = new de.telran.extraHomeWorke.collection.extra15.emptity.Book(1,"Egmont", "Goethes");
//        de.telran.extraHomeWorke.collection.extra15.emptity.Book book9 = new de.telran.extraHomeWorke.collection.extra15.emptity.Book(1,"Kateryna", "Shewchenko");
//
//        System.out.println("Book 7 match: " + criteria.match(book7));
//        System.out.println("Book 8 match: " + criteria.match(book8));
//        System.out.println("Book 9 match: " + criteria.match(book9));






//        System.out.println("Match book1 with Author1: " + criteria.match(book1));
//        System.out.println("Match book2 with Author1: " + criteria.match(book2));








    }
}
