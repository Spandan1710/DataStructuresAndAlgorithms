package api;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static api.Sort.use;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SortTest {

    @Test
    public void testInsertionSort() {
        List<Integer> thisList = Arrays.asList(5, 4, 3, 2, 1);

        use("InsertionSort").toSort(thisList);

        final StringBuilder result = new StringBuilder();
        thisList.forEach(result::append);
        assertEquals("12345", result.toString());
    }

    @Test
    public void testInsertionSortWithCustomObjects() {
        List<TestObject> thisList = Arrays.asList(
                new TestObject("Spandan"),
                new TestObject("Punit"),
                new TestObject("Akshi"),
                new TestObject("Sakshi"));

        use("InsertionSort").toSort(thisList);

        assertTrue(thisList.get(0).getId().equals("Akshi"));
        assertTrue(thisList.get(1).getId().equals("Punit"));
        assertTrue(thisList.get(2).getId().equals("Sakshi"));
        assertTrue(thisList.get(3).getId().equals("Spandan"));

    }

    @Test
    public void testMergeSort(){
        List<Integer> thisList = Arrays.asList(5, 4, 3, 2, 1);

        use("MergeSort").toSort(thisList);

        final StringBuilder result = new StringBuilder();
        thisList.forEach(result::append);
        assertEquals("12345", result.toString());

    }

    @Test
    public void testMergeSortWithCustomObjects(){

        List<TestObject> thisList = Arrays.asList(
                new TestObject("Spandan"),
                new TestObject("Punit"),
                new TestObject("Akshi"),
                new TestObject("Sakshi"));

        use("MergeSort").toSort(thisList);

        assertTrue(thisList.get(0).getId().equals("Akshi"));
        assertTrue(thisList.get(1).getId().equals("Punit"));
        assertTrue(thisList.get(2).getId().equals("Sakshi"));
        assertTrue(thisList.get(3).getId().equals("Spandan"));

    }

    private final class TestObject implements Comparable<TestObject> {

        private final String id;

        public TestObject(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        @Override
        public int compareTo(TestObject o) {
            return this.id.compareTo(o.id);
        }
    }
}