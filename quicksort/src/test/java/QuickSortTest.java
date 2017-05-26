import algorithmhour.quicksort.QuickSort;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * QuickSortTest
 *
 * unit tests for quicksort
 */
public class QuickSortTest extends TestCase {

    public static void testUnsorted() {
        QuickSort<Integer> qs = new QuickSort<>();
        Integer[] arr = {1, 3, 5, 2, 4, 6};
        qs.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i=1; i<arr.length; i++) {
            assertTrue(repr, arr[i-1] <= arr[i]);
        }
    }

    public static void testSorted() {
        QuickSort<Integer> qs = new QuickSort<>();
        Integer[] arr = {0, 1, 2, 3, 4, 5};
        qs.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i=1; i<arr.length; i++) {
            assertTrue(repr, arr[i-1] <= arr[i]);
        }
    }

}
