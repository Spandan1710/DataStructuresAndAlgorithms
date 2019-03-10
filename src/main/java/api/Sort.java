package api;

import java.util.List;

/**
 * @author Spandan Dey
 * @version 1.0
 * <p>Interface to be implemented by all Sorting Algorithm class</p>
 */
public interface Sort<T extends Comparable> {
    public List<T> toSort(List<T> list);
}
