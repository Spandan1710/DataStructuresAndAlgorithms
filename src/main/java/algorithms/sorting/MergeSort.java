package algorithms.sorting;

import api.Sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable> implements Sort<T> {


    @Override
    public List<T> toSort(List<T> listToSort) {

        this.mergeSort(listToSort, 0, listToSort.size() - 1);
        return listToSort;
    }

    private void mergeSort(List<T> listToSort, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(listToSort, startIndex, midIndex);
            mergeSort(listToSort, midIndex + 1, endIndex);
            merge(listToSort, startIndex, midIndex, endIndex);

        }
    }

    private void merge(List<T> listToSort, int startIndex, int midIndex, int endIndex) {
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
                listToSort.set(i,leftList.get(li++));
            }else{
                listToSort.set(i,rightList.get(ri++));
            }
        }
    }
}
