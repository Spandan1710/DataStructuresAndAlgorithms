package algorithms.sorting;

import java.util.List;

/**
 * @author Spandan Dey
 * @version 1.0
 * <p> This class performs sorting on a list of Comparable objects
 * using the algorithm of insertion sort. The complexity is O(n<sup>2</sup>) hence direct usage for
 * for sorting purpose should be avoide. Can be used in other sorting algorithms
 * like Merge Sort, Quick Sort etc.</p>
 */
public class InsertionSort {

    private InsertionSort() {
        throw new AssertionError();
    }

    /**
     * @param list a list of Comparable objects. Comparable object can be compared against each other for sorting
     */
    public static <T extends Comparable<? super T>> void toSort(List<T> list) {

        for (int i = 0; i < list.size(); i++) {
            T key = list.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).compareTo(key) > 0) {
                    list.set(j + 1, list.get(j));
                    list.set(j, key);
                }
            }
        }
    }
}
