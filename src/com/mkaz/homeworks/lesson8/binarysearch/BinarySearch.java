package com.mkaz.homeworks.lesson8.binarysearch;


import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static int binarySearch(int[] array, int elem) {
        int minPos = 0;
        int maxPos = array.length;
        int pos = array.length / 2;
        while (minPos + 1 != maxPos) {
            if (array[pos] == elem) return pos;
            if (array[pos] < elem) {
                minPos = pos;
                pos = (minPos + maxPos) / 2;
            }
            if (array[pos] > elem) {
                maxPos = pos;
                pos = maxPos / 2;
            }
        }
        if (array[minPos] == elem) {
            return minPos;
        }
        return -(minPos + 2);
    }

    static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator) {
        int minPos = 0;
        int maxPos = list.size();
        int pos = list.size() / 2;
        while (minPos + 1 != maxPos) {
            if (list.get(pos).equals(elem)) return pos;
            if (comparator.compare(list.get(pos), elem) < 0) {
                minPos = pos;
                pos = (minPos + maxPos) / 2;
            }
            if (comparator.compare(list.get(pos), elem) > 0) {
                maxPos = pos;
                pos = maxPos / 2;
            }
        }
        if (list.get(minPos).equals(elem)) {
            return minPos;
        }
        return -(minPos + 2);
    }
}
