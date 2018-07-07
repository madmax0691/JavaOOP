package com.mkaz.homeworks.lesson9.storage;

//Написать класс MapProductStorage, который реализует интерфейс ProductStorage с использованием HashMap.
// Все операции из интерфейса должны выполняться за константное время O(1).


public class MapProductRunner {
    public static void main(String[] args) {
        Product productOne = new Product(2, "Nokia", "Mobile phone", 500);
        Product productTwo = new Product(3, "Siemens", "Mobile phone", 100);

        MapProductStorage mapProductStorage = new MapProductStorage();
        mapProductStorage.save(productOne);
        mapProductStorage.save(productTwo);

        System.out.println(mapProductStorage);
        System.out.println(mapProductStorage.findById(3));
        System.out.println(mapProductStorage.findById(2));
        mapProductStorage.deleteById(2);
        System.out.println(mapProductStorage);
    }
}
//Test
//MapProductStorage{productMap={2=Product{id=2, name='Nokia', description='Mobile phone', price=500}, 3=Product{id=3, name='Siemens', description='Mobile phone', price=100}}}
//Optional[Product{id=3, name='Siemens', description='Mobile phone', price=100}]
//Optional[Product{id=2, name='Nokia', description='Mobile phone', price=500}]
//MapProductStorage{productMap={3=Product{id=3, name='Siemens', description='Mobile phone', price=100}}}
//
//Process finished with exit code 0