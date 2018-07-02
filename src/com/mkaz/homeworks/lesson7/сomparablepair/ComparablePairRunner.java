package com.mkaz.homeworks.lesson7.сomparablepair;

//Написать класс сomparablepair<T>, хранящий 2 объекта, умеющих сравниваться друг с другом. .
// В классе присутствуют 2 метода - T bigger(), T smaller(), - находящие больший и меньший объект из 2-ух в паре.
// Если объекты одинаковые, то возвращать первый.

import java.time.LocalDate;

public class ComparablePairRunner {
    public static void main(String[] args) {
        ComparablePair<String> names = new ComparablePair<>("Alexander", "Bob");
        System.out.println(names.bigger()); // Bob
        System.out.println(names.smaller()); // Alexander

        ComparablePair<LocalDate> dates = new ComparablePair<>(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1990, 10, 3)
        );
        System.out.println(dates.bigger()); // 1995-08-04
        System.out.println(dates.smaller()); // 1990-10-03
    }
}
//Test
//Bob
//Alexander
//1995-08-04
//1990-10-03
//
//Process finished with exit code 0