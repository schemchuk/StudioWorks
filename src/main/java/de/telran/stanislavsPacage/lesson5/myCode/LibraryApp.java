package de.telran.stanislavsPacage.lesson5.myCode;


import de.telran.stanislavsPacage.lesson5.linkedlist.core.LibraryOperations;

public class LibraryApp {

    /*

    CRUD - create, read (search), update, delete


    1) создать список 10 элементов
    2) добавить в начало и в хвост по одному элементу
    3) удалить элемент который удовлетворяет условиям
    4) создать два дубликата коллекции
    5) отсортировать дубликаты по возрастанию и по убыванию

     1)
     - получить данные от пользователя или другого источника о размере нашей коллекции
     - создание коллекции
     - наполнение коллекции:
        - получение данных для заполнения элементов коллекции
        - проверка корректности данных (валидация) - ?

      2) добавление элементов коллекции
       - начало
       - конец

       3) поиск элемента который удовлетворяет условиям
       - удаление этого элемента из коллекции

       4) создание дубликатов
       5) сортировка


     */

    public static void main(String[] args) {
        LibraryOperations libraryOperations = new LibraryOperations();
        libraryOperations.run();
    }
}
