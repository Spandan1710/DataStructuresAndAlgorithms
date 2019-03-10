package utils.sort;

import algorithms.sorting.InsertionSort;
import api.Sort;

import java.util.HashMap;
import java.util.Map;

public class Sorter<T extends Comparable<T>> {
    private Map<String, Sort<T>> classMap = new HashMap<>();

    {
        classMap.put("insertionSort", new InsertionSort<>());
    }

    public Sort<T> use(String algorithm) {
        return classMap.get(algorithm);
    }
}
