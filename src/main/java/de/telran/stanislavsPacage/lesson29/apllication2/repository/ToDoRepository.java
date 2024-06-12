package de.telran.stanislavsPacage.lesson29.apllication2.repository;

import de.telran.stanislavsPacage.lesson29.apllication2.domain.TodoEntity;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {

   TodoEntity save(TodoEntity entity);

   List<TodoEntity> findAll();

   Optional<TodoEntity> findById(Integer id);
}
