package algorithmhour.sort.quicksort;

import algorithmhour.sort.Sort;

/**
 * QuickSort
 *
 * abstract quicksort
 * @param <T>
 */
abstract class QuickSort<T> implements Sort<T> {

    /**
     * sort
     * this is an in place sort
     * @param arr
     */
    public T[] sort(T[] arr) {
        sortHelper(arr, 0, arr.length-1);
        return arr;
    }

    /**
     * sortHelper
     *
     * primary driver of quicksort implementation, recursively
     * calls quicksort until lo >= hi
     * @param arr
     * @param lo
     * @param hi
     */
    protected void sortHelper(T[] arr, int lo, int hi) {
        if (lo < hi) {
            int p = partition(arr, lo, hi);
            sortHelper(arr, lo, p-1);
            sortHelper(arr, p+1, hi);
        }
    }

    /**
     * partition
     *
     * different partition schemes are known for quicksort
     * the implementation classes will take care of the partitioning
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    abstract int partition(T[] arr, int lo, int hi);

}
