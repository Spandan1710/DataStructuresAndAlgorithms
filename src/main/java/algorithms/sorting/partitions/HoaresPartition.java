package algorithms.sorting.partitions;

import java.util.Comparator;
import java.util.List;

import static algorithms.sorting.partitions.PartitionUtil.isPivotGreater;
import static java.util.Collections.swap;

public class HoaresPartition {

    public <T extends Comparable<T>> int rearrange(List<T> data, int startIndex, int endIndex) {
        int firstIndex = startIndex + 1, secondIndex = endIndex + 1;
        T pivot = data.get(startIndex);
        while (firstIndex != secondIndex) {
            if (isPivotGreater(pivot, data.get(firstIndex))) {
                firstIndex++;
            } else if (isPivotGreater(pivot, data.get(--secondIndex))) {
                swap(data, firstIndex, secondIndex);
            }
        }
        swap(data, startIndex, firstIndex);
        return firstIndex;
    }


    public <T extends Comparator<T>> int rearrange(List<T> data, Comparator<T> comparator,
                                                   int startIndex,
                                                   int endIndex) {
        int firstIndex = startIndex + 1, secondIndex = endIndex + 1;
        T pivot = data.get(startIndex);
        while (firstIndex != secondIndex) {
            if (isPivotGreater(pivot, data.get(firstIndex), comparator)) {
                firstIndex++;
            } else if (isPivotGreater(pivot, data.get(--secondIndex), comparator)) {
                swap(data, firstIndex, secondIndex);
            }
        }
        swap(data, startIndex, firstIndex);
        return firstIndex;
    }
}
