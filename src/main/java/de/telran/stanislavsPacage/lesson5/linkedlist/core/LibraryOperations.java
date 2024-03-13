package de.telran.stanislavsPacage.lesson5.linkedlist.core;


import de.telran.stanislavsPacage.lesson5.linkedlist.entity.Book;
import de.telran.stanislavsPacage.lesson5.linkedlist.service.InputData;
import de.telran.stanislavsPacage.lesson5.linkedlist.service.LibraryUtil;
import de.telran.stanislavsPacage.lesson5.linkedlist.service.OutputData;

import java.util.List;

public class LibraryOperations {
    LibraryUtil lu = new LibraryUtil();
    InputData inputData = new InputData();
    OutputData outputData = new OutputData();


    public void run() {
       int sizeOfOurLibrary = inputData.inputNumberOfElements();
        List<Book> ourLibrary = lu.createLibrary();
        lu.fillLibrary(ourLibrary,sizeOfOurLibrary,inputData,false);
        outputData.printOurLibrary("Our library",ourLibrary);



        int numberElementsForSecondAdd = inputData.inputNumberOfElementsForSecondAdd();
        lu.fillLibrary(ourLibrary,numberElementsForSecondAdd,inputData,true);
        lu.fillLibrary(ourLibrary,numberElementsForSecondAdd,inputData,false);

        outputData.printOurLibrary("Our library after second addition ",ourLibrary);

        System.out.println("=========================");

        List<Book> booksAfterSearch = lu.searchBook(ourLibrary, inputData.inputSearchCriteria());
        outputData.printOurLibrary("Search books:", booksAfterSearch);

        lu.deleteBook(ourLibrary, booksAfterSearch);
        outputData.printOurLibrary("Our library after delete book ",ourLibrary);


        List<Book> duplicateLibrary =  lu.createDuplicateLibrary(ourLibrary);
        outputData.printOurLibrary("Duplicate collection", duplicateLibrary);

    }

}
