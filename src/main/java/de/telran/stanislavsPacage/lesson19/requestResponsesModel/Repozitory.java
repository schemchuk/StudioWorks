package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

import java.util.List;
import java.util.Optional;

public interface Repozitory <T> {
    void save(T entity);

    List<T> findAll();

    Optional<T> findById();
}
