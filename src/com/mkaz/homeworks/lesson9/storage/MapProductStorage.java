package com.mkaz.homeworks.lesson9.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapProductStorage implements ProductStorage {
    private final Map<Long, Product> productMap = new HashMap<>();

    @Override
    public Optional<Product> findById(long id) {
        return Optional.of(productMap.get(id));
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void deleteById(long id) {
        productMap.remove(id);
    }

    @Override
    public String toString() {
        return "MapProductStorage{" +
                "productMap=" + productMap +
                '}';
    }
}
