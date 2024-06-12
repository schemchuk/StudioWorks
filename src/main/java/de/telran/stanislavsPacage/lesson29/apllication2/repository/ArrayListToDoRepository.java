package de.telran.stanislavsPacage.lesson29.apllication2.repository;

import de.telran.stanislavsPacage.lesson29.apllication2.domain.TodoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListToDoRepository implements  ToDoRepository{

    private Integer idSequence = 0;
    private List<TodoEntity> dataBase = new ArrayList<>();

    @Override
    public TodoEntity save(TodoEntity entity) {
        if (entity.getId() != null) {
            return update(entity);
        } else {
            entity.setId(++idSequence);
            dataBase.add(entity);
        }
        return entity;
    }

    private TodoEntity update(TodoEntity entity) {
        for (int i = 0; i < dataBase.size(); i++) {
            var existingEntity = dataBase.get(i);
            if (existingEntity.getId().equals(entity.getId())) {
                dataBase.set(i, entity);
                return entity;
            }
        }
        throw new IllegalArgumentException("Failed to update");
    }

    @Override
    public List<TodoEntity> findAll() {
        return dataBase;
    }

    @Override
    public Optional<TodoEntity> findById(Integer id) {
        return dataBase.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst();
    }
}
