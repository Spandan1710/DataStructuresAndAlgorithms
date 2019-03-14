package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>This class uses Merge Sort algorithm to sort objects in a collection.
 * Objects must extend comparable</p>
 *
 * @author Spandan Dey
 */
public class MergeSort {

    private MergeSort() {
        throw new AssertionError();
    }


    /**
     * <p>External api for calling merge sort.</p>
     *
     * @param listToSort Collection to be sorted.
     */
    public static <T extends Comparable<? super T>> void toSort(List<T> listToSort) {

        mergeSort(listToSort, 0, listToSort.size() - 1);

    }

    /**
     * <p> Helper function which actually implement divide and conquer approach for
     * merge sort.</p>
     *
     * @param listToSort Collection to be sorted.
     * @param startIndex Starting index from where the sorting is to be done.
     * @param endIndex   End Index up to which sorting is to be done.
     */
    private static <T extends Comparable<? super T>> void mergeSort(List<T> listToSort, int startIndex, int endIndex) {

        if (startIndex != endIndex) {
            int midIndex = startIndex + ((endIndex - startIndex) / 2);
            mergeSort(listToSort, startIndex, midIndex);
            mergeSort(listToSort, midIndex + 1, endIndex);
            merge(listToSort, startIndex, midIndex, endIndex);

        }
    }

    /**
     * <p>This helper method is responsible for merging of two sorted arrays returned by
     * merge sort algo. this represents the Merge part of Divide and Conquer.</p>
     *
     * @param listToSort Collection to be sorted.
     * @param startIndex Starting index from where the sorting is to be done.
     * @param midIndex   Middle index of the start and end index.
     * @param endIndex   End Index up to which sorting is to be done.
     */
    private static <T extends Comparable<? super T>> void merge(List<T> listToSort,
                                                                int startIndex,
                                                                int midIndex,
                                                                int endIndex) {
        List<T> leftList = new ArrayList<>();
        List<T> rightList = new ArrayList<>();
        for (int i = startIndex; i <= endIndex; i++) {
            if (i <= midIndex) {
                leftList.add(listToSort.get(i));
            } else {
                rightList.add(listToSort.get(i));
            }
        }
        int li = 0, ri = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if ((ri == rightList.size())
                    || (li < leftList.size()
                    && leftList.get(li).compareTo(rightList.get(ri)) < 0)) {
                listToSort.set(i, leftList.get(li++));
            } else {
                listToSort.set(i, rightList.get(ri++));
            }
        }
    }
}
