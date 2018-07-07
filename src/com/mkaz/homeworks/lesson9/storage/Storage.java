package com.mkaz.homeworks.lesson9.storage;

/**
 * Хранилище сущностей.
 *
 * @param <T> тип сущности.
 * @param <ID> тип id у сущности.
 */


import java.util.Optional;

public interface Storage<T extends Entity<ID>, ID> {
    Optional<T> findById(ID id);

    void save(T entity);

    void deleteById(ID id);
}