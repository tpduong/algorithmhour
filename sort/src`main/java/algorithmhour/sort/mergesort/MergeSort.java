package algorithmhour.sort.mergesort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.util.CompareUtils;

/**
 * MergeSort
 *
 * implementation of merge sort
 */
public class MergeSort<T extends Comparable<? super T>> implements Sort<T> {

    /**
     * merge
     *
     * merges two arrays into new array
     * we use casting to get around generics problem here
     * @param arr1
     * @param arr2
     * @return
     */
    @SuppressWarnings("unchecked")
    private T[] merge(T[] arr1, T[] arr2) {
        int size = arr1.length + arr2.length-2;
        Object[] arr = new Object[size];
        int ptr1 = 0, ptr2 = 0;
        for (int i=0; i < size; i++) {
            if (ptr1 < arr1.length && ptr2 < arr2.length) {
                if (CompareUtils.lte(arr1[ptr1], arr2[ptr2])) {
                    arr[i] = arr1[ptr1++];
                } else {
                    arr[i] = arr2[ptr2++];
                }
            } else if (ptr1 < arr1.length) {
                arr[i] = arr1[ptr1++];
            } else {
                arr[i] = arr2[ptr2++];
            }
        }

        return (T[]) arr;
    }


    private T[] sortHelper(T[] arr, int lo, int hi) {
        int mid = arr.length / 2;
        T[] left = sortHelper(arr, lo, mid);
        T[] right = sortHelper(arr, mid+1, hi);
        return merge(left, right);
    }


    /**
     * sort
     *
     * this is an in place sort
     * @param arr
     * @return
     */
    public T[] sort(T[] arr) {
        return sortHelper(arr, 0, arr.length);
    }

}
