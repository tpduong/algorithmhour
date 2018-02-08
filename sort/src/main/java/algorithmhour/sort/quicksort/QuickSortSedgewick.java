package algorithmhour.sort.quicksort;

import algorithmhour.sort.util.ArrayUtils;
import algorithmhour.sort.util.CompareUtils;

/**
 * QuickSortSedgewick
 *
 * sedgewick suggested partition scheme for quicksort
 */
public class QuickSortSedgewick<T extends Comparable<? super T>> extends QuickSort<T> {

    /**
     * partition
     *
     * implementation of the sedgewick partition scheme
     * @param lo
     * @param hi
     * @return
     */
    @Override
    int partition(T[] arr, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true) {
            while (CompareUtils.lte(arr[++i], arr[lo])) { // find left item to swap
                if (i == hi) break;
            }
            while (CompareUtils.lte(arr[lo], arr[--j])) { // find right item to swap
                if (j == lo) break;
            }

            if (i >= j) break; // check if pointers cross
            ArrayUtils.swap(arr, i, j);
        }
        ArrayUtils.swap(arr, lo ,j);
        return j;
    }

}
