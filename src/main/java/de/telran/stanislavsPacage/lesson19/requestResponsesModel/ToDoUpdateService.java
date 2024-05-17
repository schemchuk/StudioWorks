package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class ToDoUpdateService {

    private final ToDoValidationService validationService;
    private final Repozitory<ToDoEntity> repozitory;

    public ToDoUpdateService(ToDoValidationService toDoValidationService, Repozitory<ToDoEntity> repozitory) {
        this.validationService = toDoValidationService;
        this.repozitory = repozitory;
    }

 ResponsData  update(ToDoEntity entity) {
        ResponsData updateResult = null;
        try {
            validationService.validate(entity);
            repozitory.save(entity);
            updateResult = new ResponsData("Ok", true, "200");
        } catch (ToDoValidationException e) {
           updateResult =  new  ResponsData("Validation error",false, "404");
            System.out.println("Validation error:");
        }
        return updateResult;
    }
}
