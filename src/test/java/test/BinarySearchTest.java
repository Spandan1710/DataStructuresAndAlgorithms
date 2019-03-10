package test;

import algorithms.search.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BinarySearchTest {

    @Test
    public void testBinarySearchHappyScenario(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Assert.assertEquals("Unable to find object present in the list",
                3,
                BinarySearch.binarySearch(list,4));

    }

    @Test
    public void testBinarySearchOnString(){
        List<String> list = Arrays.asList("Spandan",
                "Punit",
                "Sakshi",
                "Akshi",
                "Nipun");
        Collections.sort(list);
        Assert.assertEquals("Unable to find object present in the list",
                2,
                BinarySearch.binarySearch(list,"Punit"));
    }
}
