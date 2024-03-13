package de.telran.stanislavsPacage.lesson5.myCode.linkedlist.service;


import de.telran.stanislavsPacage.lesson5.myCode.linkedlist.entity.Book;
import de.telran.stanislavsPacage.lesson5.myCode.linkedlist.service.InputData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LibraryUtil {
    public List<Book> createLibrary() {
        return new LinkedList<>();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd, InputData inputData, boolean isHead){

        for (int i = 0; i < numberOfElementsAdd; i++) {
           Book book = inputData.inputNewBook();
            addElementIntoOurLibrary(ourLibrary, book, isHead);
        }
    }

    private void addElementIntoOurLibrary(List<Book> ourLibrary, Book newBook, boolean isHead){
        if (isHead) {
            ourLibrary.add(0, newBook);
        } else {
        ourLibrary.add(newBook);}
    }

    public List<Book> searchBook(List<Book> ourLibrary, String searchCriteria){
        List<Book> booksAfterSearch = new ArrayList<>();
        for (int i = 0; i < ourLibrary.size(); i++) {
            if (searchCriteria.equals(ourLibrary.get(i).getNameOfBook())) {
                booksAfterSearch.add(ourLibrary.get(i));
            }
        }
        return booksAfterSearch;
    }

    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }

    public List<Book> createDuplicateLibrary(List<Book> ourLibrary){
        List<Book> duplicateCollection = new ArrayList<>(ourLibrary);

                /*
       2) ArrayList<Book> listCopy = (ArrayList<Book>).ourLibrary.clone();

        3) List<Book> listCopy = new ArrayList<>();
            listCopy.addAll(0,ourLibrary);

            4) Collections.copy(dist, src)
         */

        return duplicateCollection;
    }

    public void sortOurLibrary(List<Book> ourLibrary, boolean isGrow){

    }


}
