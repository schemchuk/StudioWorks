package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class ToDoListApplication {
    public static void main(String[] args) {
        ToDoValidationService validationService = new ToDoValidationService();
        ToDoRepository toDoRepository = new ToDoRepository();
        ToDoUpdateService service = new ToDoUpdateService(validationService,toDoRepository);
        UserConsole userConsole = new UserConsole();
       // UserFileRetrieveService userFile = new UserFileRetrieveService();

        UIMenu uiMenu = new UIMenu(service, userConsole );

        uiMenu.startUI();
    }
}

