package algorithmhour.sort.quicksort;

import algorithmhour.sort.util.ArrayUtils;
import algorithmhour.sort.util.CompareUtils;

/**
 * QuickSortHoare
 * <p>
 * quicksort using hoare partition method
 */
public class QuickSortHoare<T extends Comparable<? super T>> extends QuickSort<T> {

    /**
     * partition
     * <p>
     * implementation of hoare partition scheme
     *
     * @param arr the input array of values
     * @param lo  the lo index from which to build the partition
     * @param hi  the hi index to which to build the partition
     * @return
     */
    @Override
    int partition(T[] arr, int lo, int hi) {
        T pivot = arr[lo];
        int i = lo, j = hi;
        while (true) {
            while (CompareUtils.lt(arr[i], pivot)) {
                i++;
            }

            while(CompareUtils.gt(arr[j], pivot)) {
                j--;
            }

            if (i >= j) {
                return j;
            }
            ArrayUtils.swap(arr, i, j);
        }
    }
}


