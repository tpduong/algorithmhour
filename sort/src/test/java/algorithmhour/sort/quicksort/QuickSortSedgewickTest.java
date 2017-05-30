package algorithmhour.sort.quicksort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.SortTest;

/**
 * QuickSortSedgewick
 *
 * unit tests for sedgewick partition implementation of quicksort
 */
public class QuickSortSedgewickTest extends SortTest {


    @Override
    protected Sort<Integer> createSort() {
       return new QuickSortSedgewick<>();
   }

}
