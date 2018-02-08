package algorithmhour.sort.quicksort;

import algorithmhour.sort.util.ArrayUtils;
import algorithmhour.sort.util.CompareUtils;

/**
 * QuickSortLomuto
 * <p>
 * this implementation uses generics
 */
public class QuickSortLomuto<T extends Comparable<? super T>> extends QuickSort<T> {


    /**
     * partition
     * <p>
     * implementation of lomuto partition scheme
     *
     * @param arr the input array of values
     * @param lo  the lo index from which to build the partition
     * @param hi  the hi index to which to build the partition
     * @return
     */
    @Override
    int partition(T[] arr, int lo, int hi) {
        // worst case this causes O[n^2] runtime :(
        // choose pivot to be last element in range lo-hi
        T pivot = arr[hi];
        int i = lo - 1;
        for (int j = lo; j <= hi - 1; j++) {
            if (CompareUtils.lte(arr[j], pivot)) {
                i = i + 1;
                if (i != j) { // this check avoids swapping when i=j (which occurs often)
                    ArrayUtils.swap(arr, i, j);
                }
            }
        }
        ArrayUtils.swap(arr, i + 1, hi);
        return i + 1;
    }

}
