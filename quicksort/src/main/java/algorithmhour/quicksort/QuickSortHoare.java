package algorithmhour.quicksort;

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
    protected int partition(T[] arr, int lo, int hi) {
        T pivot = arr[lo];
        int i = lo, j = hi;
        while (true) {
            while (arr[i].compareTo(pivot) < 0) {
                i++;
            }

            while(arr[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }
}


