package com.mkaz.homeworks.lesson7.max;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Max {
    public static <T> T max(List<T> list, Comparator<T> comparator) {
        return Collections.max(list, comparator);
    }
}
