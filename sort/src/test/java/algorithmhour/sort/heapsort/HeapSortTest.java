package algorithmhour.sort.heapsort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.SortTest;

/**
 * HeapSortTest
 *
 * unit tests for heapsort
 */
public class HeapSortTest extends SortTest {

    @Override
    protected Sort<Integer> createSort() {
        return new HeapSort<>();
    }

}
