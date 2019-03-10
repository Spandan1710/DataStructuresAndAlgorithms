package algorithms.search;

import java.util.Arrays;
import java.util.List;

/**
 * @author Spandan Dey
 * @version 1.0
 * <p>A utility class to perform binary search on any list of object
 * given the class of the objects are comparable </p>
 */
public class BinarySearch{

    public static int binarySearch(List<? extends Comparable> list, Comparable object){
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(list.get(mid).equals(object)){
                return mid;
            }else if(list.get(mid).compareTo(object) == -1){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }


}
