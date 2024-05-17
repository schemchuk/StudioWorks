package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class ToDoValidationService {
    public void validate(ToDoEntity toDoEntity) {
        if (toDoEntity.getTitle().isBlank()) {
            throw new ToDoValidationException("Incorrect title");
        }
    }
}
