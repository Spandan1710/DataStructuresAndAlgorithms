package algorithms.sorting.partitions;

import java.util.Comparator;

public class PartitionUtil {

    public static <T extends Comparator<T>> boolean isPivotGreater(T pivot, T t, Comparator<T> comparator) {
        return comparator.compare(pivot, t) > 0;
    }

    public static <T extends Comparable<T>> boolean isPivotGreater(T pivot, T t) {
        return pivot.compareTo(t) > 0;
    }
}
