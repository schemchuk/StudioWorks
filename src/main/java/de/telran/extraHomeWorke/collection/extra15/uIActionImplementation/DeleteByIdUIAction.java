package de.telran.extraHomeWorke.collection.extra15.uIActionImplementation;

import de.telran.extraHomeWorke.collection.extra15.emptity.Book;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;
    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ID книги для удаления:");
        Long id = Long.parseLong(scanner.nextLine());

        Optional<Book> bookOptional = bookDatabase.findById(id);

        if (bookOptional.isPresent()){
            Book book = bookOptional.get();
            boolean deleted = bookDatabase.delete(id);
            if (deleted){
                System.out.println("Удалена книга: " + book);
            }
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }
    }
}
