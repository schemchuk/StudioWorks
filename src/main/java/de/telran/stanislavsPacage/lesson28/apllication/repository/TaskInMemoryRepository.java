package de.telran.stanislavsPacage.lesson28.apllication.repository;


import de.telran.stanislavsPacage.lesson28.apllication.domain.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskInMemoryRepository {
    private Long taskId = 0L;
    private Map<Long, Task> taskMap = new HashMap<>();

    public void insert(Task task) {
        task.setId(++taskId);
        taskMap.put(taskId,task);
    }

    public Map<Long,Task> findAll() {return  taskMap;}

    public Task findById(Long id) {return taskMap.get(id);}

}
