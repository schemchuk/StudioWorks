package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги:");
        String title = scanner.nextLine();

        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();

        Book book = new Book(title,author);

        long id = bookDatabase.save(book);
        System.out.println("Книга успешно сохранена в базе данных с ID: " + id);
    }
}
