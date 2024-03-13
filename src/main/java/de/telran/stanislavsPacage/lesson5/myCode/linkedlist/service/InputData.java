package de.telran.stanislavsPacage.lesson5.myCode.linkedlist.service;

import de.telran.stanislavsPacage.lesson5.myCode.linkedlist.entity.Author;
import de.telran.stanislavsPacage.lesson5.myCode.linkedlist.entity.Book;


public class InputData {

    int count = 0;
    int countOFBook = 0;

    public Book inputNewBook(){

        count++;
        if (count % 2 == 0 ) {countOFBook++;}
        String nameOfBook = "Book name " + countOFBook;
        Author author = new Author(0, "Author " + count);

        return new Book(count,author,nameOfBook);
    }

    public int inputNumberOfElements(){
        return 10;
    }

    public int inputNumberOfElementsForSecondAdd(){
        return 1;
    }

    public String inputSearchCriteria(){
        return "Book name 5";
    }

}
