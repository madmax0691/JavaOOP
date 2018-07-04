package com.mkaz.homeworks.lesson8.cleaner;

//Реализовать метод удаления из коллекции всех null элементов.
//	static void removeNulls(Collection<?> collection) { … }
//
//Реализовать обобщенную версию метода, который удаляет из коллекции все элементы, соответствующие предикату.
//static <T> void remove(Collection<T> collection,
//   Predicate<T> predicate) { … }
//
//Для реализации использовать факт, что интерфейс Collection<T> расширяет интерфейс Iterable<T>
// (см. Iterable<T> vs Iterator<T>).
//(Примечание: стандартная библиотека Java 8 уже имеет реализацию метода  remove(...).
// В задании предлагается самостоятельно реализовать метод для изучения Iterable<T> + Iterator<T>)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullsRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Max");
        list.add(null);
        list.add("Masha");
        System.out.println(list);
        System.out.println();

        RemoveNulls.removeNulls(list);
        System.out.println(list);
        System.out.println();

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };
        List<String> listTwo = new ArrayList<>();
        listTwo.add("Maksim");
        listTwo.add("Mark");
        listTwo.add("Konstantin");
        System.out.println(listTwo);
        System.out.println();

        RemoveNulls.remove(listTwo, predicate);
        System.out.println(listTwo);

    }
}
//Test
//[Max, null, Masha]
//
//[Max, Masha]
//
//[Maksim, Mark, Konstantin]
//
//[Mark]
//
//Process finished with exit code 0