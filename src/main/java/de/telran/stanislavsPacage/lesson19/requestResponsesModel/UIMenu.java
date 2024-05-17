package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class UIMenu {
    private final ToDoUpdateService toDoUpdateService;
    private final UserDataRetrieveService retrieveService;

    public UIMenu(ToDoUpdateService toDoUpdateService, UserDataRetrieveService retrieveService) {
        this.toDoUpdateService = toDoUpdateService;
        this.retrieveService = retrieveService;
    }
    void startUI() {
        String title = retrieveService.retriveTitle();
        ToDoEntity entity = new ToDoEntity(title);

        toDoUpdateService.update(entity);
    }
}
