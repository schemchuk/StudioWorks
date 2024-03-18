package de.telran.javaPro.withGroup;

import de.telran.javaPro.summary.work_24_03_15.works.Box;

public class IteratorSimple {
    //1. Для класса MyArrayList, в котором данные хранятся во внутреннем массиве,
//реализовать итератор, который выдавал бы данные в случайном порядке.
//Например, первый запуск цикла
//for (String s : list) {
//   System.out.println(s);
//}
//вернет A, D, C, B
//второй запуск цикла вернет B, D, A, C
//2. Имеется класс Box
//public class Box {
//    String itemA;
//    String itemB;
//    String itemC;
//}
//Реализовать для него итератор.
//3. Имеется класс SquareArrayList, данные в котором хранятся в двумерном массиве
//public class SquareArrayList {
//    private int[][] data;
//}
//Реализовать для него итератор.
//4. Модель действий работников в офисе:
//- Создать интерфейс JobActions
//public interface JobActions {
//    void doTask(Task task);
//    void haveRest();
//}
//- В интерфейс JobActions поместить класс Task с описанием задач
//class Task {
//    private String name;
//    private String description;
//}
//В классе Office в main() методе
//    - создать несколько задач Task
//    - через анонимные классы имплементирующие JobActions создать несколько работников:
//        manager - сообщает название заданий, пьет кофе по время отдыха
//        worker - делает задания, курит по время отдыха
//        lazyWorker - все время бездействует
//    - передать задачи работникам и проверить работу методов классов
    public static void main(String[] args) {
Box box = new Box("Sraka","Banka","Wokulary");
for (String item : box)
        System.out.println(item);
    }
}
