package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

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

        // Optional<>
    }
}
