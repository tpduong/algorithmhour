package algorithmhour.sort.quicksort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.SortTest;

/**
 * QuickSortHoareTest
 *
 * unit tests for hoare partition scheme
 */
public class QuickSortHoareTest extends SortTest {

    @Override
    protected  Sort<Integer> createSort() {
        return new QuickSortHoare<>();
    }

}
