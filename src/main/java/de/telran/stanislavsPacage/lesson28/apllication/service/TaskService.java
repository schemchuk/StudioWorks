package de.telran.stanislavsPacage.lesson28.apllication.service;


import de.telran.stanislavsPacage.lesson28.apllication.domain.Task;
import de.telran.stanislavsPacage.lesson28.apllication.repository.TaskInMemoryRepository;

import java.util.Map;

public class TaskService {
    private TaskInMemoryRepository repository = new TaskInMemoryRepository();

    public Long saveTask(Task task) {
        // провести проверку корректности данных полей task (Validation)
        repository.insert(task);
        return task.getId();
    }

    public Map<Long, Task> findAll(){
        // может появится проверка прав пользователя
        return repository.findAll();}

    public Task findById(Long id){
        // может появится проверка прав пользователя
        return repository.findById(id);}

}
