package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите автора: ");
        String author = scanner.nextLine();

        List<Book> booksByAuthor= bookDatabase.findByAuthor(author);

        if (!booksByAuthor.isEmpty()) {
            for (Book book : booksByAuthor){
                System.out.println("Найденные книги автора: " + author + " : " + book);
            }

        } else {
            System.out.println("Книг автора" + author + " нет в базе");
        }
    }
}
