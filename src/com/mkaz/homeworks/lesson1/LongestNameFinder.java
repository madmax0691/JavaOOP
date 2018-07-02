package com.mkaz.homeworks.lesson1;

//Написать метод, находящий самое длинное имя пользователя в списке имен.
// Если список пустой, бросить исключение IllegalArgumentException.
//Использовать цикл for-each.

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));

        System.out.println(longestName(names));
        longestName(new ArrayList<>());
    }

    public static String longestName(ArrayList<String> names) {
        if (names.size() == 0) {
            throw new IllegalArgumentException("size = 0");
        }
        int index = 0;
        int i = 0;
        for (String name :
                names) {
            if (name.length() > names.get(index).length()) {
                index = i;
            }
            i++;
        }
        return names.get(index);

    }
}
//Richard
//Exception in thread "main" java.lang.IllegalArgumentException: size = 0
//	at com.mkaz.homeworks.lesson1.LongestNameFinder.longestName(LongestNameFinder.java:20)
//	at com.mkaz.homeworks.lesson1.LongestNameFinder.main(LongestNameFinder.java:15)
//
//Process finished with exit code 1