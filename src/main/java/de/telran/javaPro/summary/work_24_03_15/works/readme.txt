2. Имеется класс Box
public class Box {
    String itemA;
    String itemB;
    String itemC;
}
Реализовать для него итератор.
3. Имеется класс SquareArrayList, данные в котором хранятся в двумерном массиве
public class SquareArrayList {
    private int[][] data;
}
Реализовать для него итератор.
4. Модель действий работников в офисе:
- Создать интерфейс JobActions
public interface JobActions {
    void doTask(Task task);
    void haveRest();
}
- В интерфейс JobActions поместить класс Task с описанием задач
class Task {
    private String name;
    private String description;
}
В классе Office в main() методе
    - создать несколько задач Task
    - через анонимные классы имплементирующие JobActions создать несколько работников:
        manager - сообщает название заданий, пьет кофе по время отдыха
        worker - делает задания, курит по время отдыха
        lazyWorker - все время бездействует
    - передать задачи работникам и проверить работу методов классов
