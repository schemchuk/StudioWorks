package de.telran.extraHomeWorke.collection.extra15.library;

import de.telran.extraHomeWorke.collection.extra15.bookDatabaseImplementation.BookDatabaseImpl;
import de.telran.extraHomeWorke.collection.extra15.interfaces.BookDatabase;
import de.telran.extraHomeWorke.collection.extra15.interfaces.UIAction;
import de.telran.extraHomeWorke.collection.extra15.uIActionImplementation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
//        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
//        menuNumberToActionMap.put(2, new SaveBookUIAction(bookDatabase));
//        menuNumberToActionMap.put(3, new SaveBookUIAction(bookDatabase));
//        menuNumberToActionMap.put(4, new SaveBookUIAction(bookDatabase));
//        menuNumberToActionMap.put(5, new SaveBookUIAction(bookDatabase));

        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2,new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3,new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(4,new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(5,new FindByTitleUIAction(bookDatabase));

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
}

