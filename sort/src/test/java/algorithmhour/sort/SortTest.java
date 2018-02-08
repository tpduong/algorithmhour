package algorithmhour.sort;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;

/**
 * SortTest
 *
 * base class
 */
public abstract class SortTest extends TestCase {

    protected Sort<Integer> createSort() {
        return null;
    }

    public void testUnsorted() {
        Sort<Integer> sorter = createSort();
        Integer[] arr = {1, 3, 5, 2, 4, 6};
        sorter.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i = 1; i < arr.length; i++) {
            TestCase.assertTrue(repr, arr[i - 1] <= arr[i]);
        }
    }

    public void testSorted() {
        Sort<Integer> sorter = createSort();
        Integer[] arr = {0, 1, 2, 3, 4, 5};
        sorter.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i = 1; i < arr.length; i++) {
            TestCase.assertTrue(repr, arr[i - 1] <= arr[i]);
        }
    }

    public void test10000Random() {
        Sort<Integer> sorter = createSort();
        Random rnd = new Random();
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = rnd.nextInt();
        }

        sorter.sort(arr);
        for (int j = 1; j < arr.length; j++) {
            assertTrue(arr[j - 1] + " was not less than" + arr[j], arr[j - 1] <= arr[j]);
        }
    }

}
