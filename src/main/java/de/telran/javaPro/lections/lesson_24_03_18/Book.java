package de.telran.javaPro.lections.lesson_24_03_18;

public class Book {
    private String title;
    private String  author;
    private double price;
    private boolean IsInStock;

    public Book(String title, String author, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        IsInStock = isInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", IsInStock=" + IsInStock +
                '}';
    }
 //public static class BookByAuthorComparator implements Comparator<Book>{

//     @Override
//     public int compare(Book o1, Book o2) {
//
//     }
 }


