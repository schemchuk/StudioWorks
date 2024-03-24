package de.telran.extraHomeWorke.collection.extra6_7;

public class SimpleBook {
    public static void main(String[] args) {
        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book(8,"Title1", "Author1" );
        Book book2 = new Book(8,"Title2", "Author2" );
        long id1 = database.save(book1);
        long id2 =  database.save(book2);

        System.out.println(database);

        System.out.println(database.delete(id1));
        System.out.println(database.delete(id1));
        System.out.println(database);


    }
}
