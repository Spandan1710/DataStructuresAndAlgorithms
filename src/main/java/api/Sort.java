package api;

import algorithms.sorting.InsertionSort;
import algorithms.sorting.MergeSort;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {


    /**
     * <p> This map holds the mapping of strings naming the sorting algo
     * and their corresponding enums</p>
     */
    private static Map<String, SortingAlgo> sortingAlgos;

    static {
        sortingAlgos = Collections.unmodifiableMap(initializeSortingAlgoMap());
    }

    /**
     * <p>Used for instance control.</p>
     */
    private Sort() {
        throw new AssertionError();
    }

    /**
     * <p>Initializing the map with all present values in the Enum.</p>
     *
     * @return An initialized Map of all Sort values' key and the Sort value itself.
     */
    private static Map<String, SortingAlgo> initializeSortingAlgoMap() {
        Map<String, SortingAlgo> sortingAlgos = new HashMap<>();
        for (SortingAlgo algo : SortingAlgo.values()) {
            sortingAlgos.put(algo.getKey(), algo);
        }
        return sortingAlgos;
    }

    /**
     * <p>An API to get an Enum based on the String passed.</p>
     *
     * @param algo The desired algorithm for sorting.
     * @return a SortingAlgo Enum Object.
     */
    public static SortingAlgo use(String algo) {
        return sortingAlgos.get(algo.toLowerCase());
    }

    /**
     * <p>This Enum is an api to provide access to various sorting algorithms.</p>
     *
     * @author Spandan Dey
     */
    public enum SortingAlgo {
        /**
         * <p>Enum representation of Insertion Sort.</p>
         */
        INSERTION_SORT("insertionsort") {
            @Override
            public <T extends Comparable<? super T>> void toSort(List<T> listToSort) {
                InsertionSort.toSort(listToSort);
            }
        },
        /**
         * <p>Enum representation of Merge Sort.</p>
         */
        MERGE_SORT("mergesort") {
            @Override
            public <T extends Comparable<? super T>> void toSort(List<T> listToSort) {
                MergeSort.toSort(listToSort);
            }
        };


        private String key;

        public String getKey() {
            return this.key;
        }


        SortingAlgo(String key) {
            this.key = key;
        }

        public abstract <T extends Comparable<? super T>> void toSort(List<T> listToSort);
    }
}
