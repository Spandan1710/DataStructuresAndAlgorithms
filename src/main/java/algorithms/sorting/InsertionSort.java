package algorithms.sorting;

import api.Sort;

import java.util.List;

/**
 * @author Spandan Dey
 * @version 1.0
 * <p> This class performs sorting on a list of Comparable objects
 * using the algorithm of insertion sort. The complexity is O(n<sup>2</sup>) hence direct usage for
 * for sorting purpose should be avoide. Can be used in other sorting algorithms
 * like Merge Sort, Quick Sort etc.</p>
 */
public class InsertionSort<T extends Comparable> implements Sort<T>    {
    /**
     *
     * @param list a list of Comparable objects. Comparable object can be compared against each other for sorting
     * @return list with objects arranged in sorted order.
     */
   @Override
    public List<T> toSort(List<T> list) {

        for(int i = 0; i< list.size();i++){
            T key = list.get(i);
            for(int j = i-1; j>=0;j--){
                if(list.get(j).compareTo(key) == 1){
                    list.set(j+1, list.get(j));
                    continue;
                }
                list.set(j+1,key);
                break;
            }
        }
        return list;
    }
}
