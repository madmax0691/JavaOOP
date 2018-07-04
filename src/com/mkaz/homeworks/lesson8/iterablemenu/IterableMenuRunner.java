package com.mkaz.homeworks.lesson8.iterablemenu;

//Дополнить класс Menu из задачи 1 лекции 2 таким образом, чтобы была возможность пройтись в for-each по всем блюдам из меню.
//Пример использования:
//Menu menu = new Menu("Italian summer");
//menu.addDish(new Dish("Margherita", "Italian pizza", 200));
//menu.addDish(new Dish("Carbonara", "Italian pasta", 100));
//menu.addDish(new Dish("Lasagne", "Flat Italian pasta", 130));
//
//for (Dish dish : menu) {
//   System.out.println(dish);
//}
//
//Для реализации использовать факт, что цикл for-each на этапе компиляции заменяется на использование итератора

import com.mkaz.homeworks.lesson2.menu.Dish;

public class IterableMenuRunner {
    public static void main(String[] args) {
        IterableMenu menu = new IterableMenu("Italian summer");
        menu.addDish(new Dish("Margherita", "Italian pizza", 200));
        menu.addDish(new Dish("Carbonara", "Italian pasta", 100));
        menu.addDish(new Dish("Lasagne", "Flat Italian pasta", 130));

        for (Dish dish : menu) {
            System.out.println(dish);
        }

    }
}
//Test
//Dish{name='Margherita', description='Italian pizza', price=200}
//Dish{name='Carbonara', description='Italian pasta', price=100}
//Dish{name='Lasagne', description='Flat Italian pasta', price=130}
//
//Process finished with exit code 0