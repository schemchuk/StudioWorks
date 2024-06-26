package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID книги:");
        long id = Long.parseLong(scanner.nextLine());

        Optional<Book> bookOptional = bookDatabase.findById(id);

        if (bookOptional.isPresent()){
            Book book = bookOptional.get();
            System.out.println("Найденная книга: " + book);
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }
        // Optional<>
    }
}
