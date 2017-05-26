package algorithmhour.quicksort;

/**
 * QuickSortSedgewick
 *
 * sedgewick suggested partition scheme for quicksort
 */
public class QuickSortSedgewick<T extends Comparable<T>> extends QuickSort<T> {

    /**
     * partition
     *
     * implementation of the sedgewick suggestions
     * @param lo
     * @param hi
     * @return
     */
    @Override
    protected int partition(T[] arr, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true) {
            while (arr[++i].compareTo(arr[lo]) <= 0) { // find left item to swap
                if (i == hi) break;
            }
            while (arr[lo].compareTo(arr[--j]) <= 0) { // find right item to seap
                if (j == lo) break;
            }

            if (i >= j) break; // check if pointers cross
            swap(arr, i, j);
        }
        swap(arr, lo ,j);
        return j;
    }

}
