package algorithmhour.sort.quicksort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.SortTest;

/**
 * algorithmhour.sort.quicksort.QuickSortLomutoTest
 * <p>
 * unit tests for quicksort
 */
public class QuickSortLomutoTest extends SortTest {

    @Override
    protected Sort<Integer> createSort() {
        return new QuickSortLomuto<>();
    }

}
