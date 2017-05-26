import algorithmhour.quicksort.QuickSortSedgewick;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * QuickSortSedgewick
 */
public class QuickSortSedgewickTest extends TestCase {


    public static void testUnsorted() {
        QuickSortSedgewick<Integer> qs = new QuickSortSedgewick<>();
        Integer[] arr = {1, 3, 5, 2, 4, 6};
        qs.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i = 1; i < arr.length; i++) {
            assertTrue(repr, arr[i - 1] <= arr[i]);
        }
    }

    public static void testSorted() {
        QuickSortSedgewick<Integer> qs = new QuickSortSedgewick<>();
        Integer[] arr = {0, 1, 2, 3, 4, 5};
        qs.sort(arr);
        String repr = Arrays.asList(arr).toString();
        for (int i = 1; i < arr.length; i++) {
            assertTrue(repr, arr[i - 1] <= arr[i]);
        }
    }
}
