package algorithms.sorting.partitions;

import java.util.Comparator;
import java.util.List;

import static algorithms.sorting.partitions.PartitionUtil.isPivotGreater;
import static java.util.Collections.swap;

public class LomutosPartition {
    
    public static <T extends Comparable<T>> int rearrange(List<T> data, int startIndex, int endIndex) {
        int firstIndex = startIndex, secondIndex = endIndex;
        T pivot = data.get(startIndex);
        while (secondIndex < data.size()) {
            secondIndex++;
            if (isPivotGreater(pivot, data.get(secondIndex))) {
                swap(data, firstIndex+1, secondIndex);
                firstIndex++;
            }
        }
        swap(data, startIndex, firstIndex);
        return firstIndex;
    }


    public static <T extends Comparator<T>> int rearrange(List<T> data,
                                                          Comparator<T> comparator,
                                                          int startIndex,
                                                          int endIndex) {
        int firstIndex = startIndex, secondIndex = endIndex;
        T pivot = data.get(startIndex);
        while (secondIndex < data.size()) {
            secondIndex++;
            if (PartitionUtil.isPivotGreater(pivot, data.get(secondIndex), comparator)) {
                swap(data, firstIndex+1, secondIndex);
                firstIndex++;
            }
        }
        swap(data, startIndex, firstIndex);
        return firstIndex;
    }
}
