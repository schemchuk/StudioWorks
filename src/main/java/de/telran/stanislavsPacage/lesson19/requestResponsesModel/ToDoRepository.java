package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToDoRepository implements Repozitory<ToDoEntity> {

    private List<ToDoEntity> dataBase = new ArrayList<>();
    @Override
    public void save(ToDoEntity entity) {

        dataBase.add(entity);
        System.out.println("Success add!");
    }

    @Override
    public List<ToDoEntity> findAll() {
        return dataBase;
    }

    @Override
    public Optional<ToDoEntity> findById() {
        return Optional.empty();
    }
}
