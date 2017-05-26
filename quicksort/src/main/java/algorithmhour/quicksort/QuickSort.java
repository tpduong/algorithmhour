package algorithmhour.quicksort;

/**
 * QuickSort
 *
 * this implementation uses generics
 */
public class QuickSort<T extends Comparable<? super T>> {

    /**
     * sortHelper
     *
     * primary driver of quicksort implementation, recursively
     * calls quicksort until lo >= hi
     * @param arr
     * @param lo
     * @param hi
     */
    private void sortHelper(T[] arr, int lo, int hi) {
        if (lo < hi) {
            int p = partition(arr, lo, hi);
            sortHelper(arr, lo, p-1);
            sortHelper(arr, p+1, hi);
        }
    }

    /**
     * partition
     *
     * implementation of lomuto partition scheme
     * @param arr the input array of values
     * @param lo the lo index from which to build the partition
     * @param hi the hi index to which to build the partition
     * @return
     */
    protected int partition(T[] arr, int lo, int hi) {
        T pivot = arr[hi]; // worst case this causes O[n^2] runtime :(
        int i = lo - 1;
        for (int j = lo; j <= hi-1; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i = i + 1;
                if (i != j) {
                    swap(arr, i, j);
                }
            }
        }
        swap(arr, i, hi);
        return i+1;
    }

    /**
     * swap
     *
     * swap elements in arr at indices i and j
     * @param arr
     * @param i
     * @param j
     */
    protected void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * sort
     *
     * this is an in place algorithm
     * @param arr
     */
    public T[] sort(T[] arr) {
        sortHelper(arr, 0, arr.length-1);
        return arr;
    }

}
