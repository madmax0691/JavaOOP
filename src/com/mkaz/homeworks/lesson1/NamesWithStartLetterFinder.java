package com.mkaz.homeworks.lesson1;

//Написать метод, находящий все имена, начинающиеся с буквы startLetter, в списке имен.
//Использовать цикл for-each.

import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));

        System.out.println(namesWithStartLetter(names, 'A').toString());
        System.out.println(namesWithStartLetter(new ArrayList<>(), 'A').toString());
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String>
                                                                 names, char startLetter) {
        ArrayList<String> namesWithStartLetter = new ArrayList<>();
        for (String name :
                names) {
            if (name.charAt(0) == startLetter) {
                namesWithStartLetter.add(name);
            }
        }
        return namesWithStartLetter;
    }
}
//[Anny, Aaron]
//[]
//
//Process finished with exit code 0