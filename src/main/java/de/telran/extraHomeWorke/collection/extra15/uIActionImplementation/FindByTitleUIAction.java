package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();

        List<Book> booksByTitle = bookDatabase.findByTitle(title);

        if (!booksByTitle.isEmpty()) {
            for (Book book : booksByTitle) {
                System.out.println("Найдены книги по названию: " + title + " , " + book);
            }
        }else {
            System.out.println("Книг по названию: " + title + " нет в базе");
        }
    }
}
