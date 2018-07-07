package com.mkaz.homeworks.lesson9.storage;

//Написать обобщенную реализацию хранилища.

import java.util.Optional;

public class MapStorageRunner {
    public static void main(String[] args) {
        Storage<Product, Long> productStorage = new MapStorage<>();

        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        Optional<Product> product = productStorage.findById(11L);
        if (product.isPresent()) {
            System.out.println(product.get()); // Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
        }
    }
}
//Test
//Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
//
//Process finished with exit code 0