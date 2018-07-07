package com.mkaz.homeworks.lesson9.storage;

/**
 * Реализация хранилища на основании HashMap.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapStorage<T extends Entity<ID>, ID> implements Storage<T, ID> {
    private final Map<ID, T> storageMap = new HashMap<>();

    @Override
    public Optional<T> findById(ID id) {
        return Optional.of(storageMap.get(id));
    }

    @Override
    public void save(T entity) {
        storageMap.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        storageMap.remove(id);
    }
}