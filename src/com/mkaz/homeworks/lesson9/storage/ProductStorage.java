package com.mkaz.homeworks.lesson9.storage;

import java.util.Optional;

public interface ProductStorage {
    Optional<Product> findById(long id);

    void save(Product product);

    void deleteById(long id);
}