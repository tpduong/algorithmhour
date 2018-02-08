package algorithmhour.sort.mergesort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.SortTest;
import algorithmhour.sort.heapsort.HeapSort;

/**
 * MergeSortTest
 * <p>
 * unit tests for merge sort
 */
public class MergeSortTest extends SortTest {

    @Override
    protected Sort<Integer> createSort() {
        return new HeapSort<>();
    }

}
