package algorithmhour.sort.heapsort;

import algorithmhour.sort.Sort;
import algorithmhour.sort.util.ArrayUtils;
import algorithmhour.sort.util.CompareUtils;

/**
 * HeapSort
 *
 * implementation of heapsort
 */
public class HeapSort<T extends Comparable<? super T>> implements Sort<T> {

    /**
     * heapify
     *
     * put the elements of arr in heap order - in place
     * @param arr

     */
    private void heapify(T[] arr) {
        // in array based heap
        // arr.length-1 contains the last
        // parent index
        int idx = parentIdx(arr.length-1);
        while (idx >= 0) {
            siftDown(arr, idx--,arr.length-1);
        }
    }

    /**
     * siftDown
     *
     * repair the heap starting from `start` assuming the heaps
     * rooted at `start`'s children are valid
     * @param arr
     * @param start
     * @param end
     */
    private void siftDown(T[] arr, int start, int end) {
        int rootIdx = start;
        while (leftChildIdx(rootIdx) <= end) { // while there is a child
            int childIdx = leftChildIdx(rootIdx);
            int swapIdx = rootIdx;
            if (CompareUtils.lt(arr[swapIdx], arr[childIdx])) {
                // update swap if child is lt swap
                swapIdx = childIdx;
            }

            if (CompareUtils.lte(childIdx+1, end) && CompareUtils.lt(arr[swapIdx], arr[childIdx+1])) {
                // update swap if child + 1 is lte swap
                swapIdx = childIdx + 1;
            }

            if (swapIdx == rootIdx) {
                // we're done
                return;
            } else {
                ArrayUtils.swap(arr, rootIdx, swapIdx);
                rootIdx = swapIdx;
            }
        }
    }

    /**
     * return the left child of the array
     * @return
     */
    private int leftChildIdx(int idx) {
        return (2 * idx) + 1;
    }

    /**
     * parentIdx
     *
     * given an index, return it's parent
     * @param idx
     * @return
     */
    private int parentIdx(int idx) {
        if (idx == 0) {
            return 0;
        }
        return (idx-1) / 2;
    }

    private void sortHelper(T[] arr) {
        heapify(arr); // build the heap. duh.
        int end = arr.length-1;
        while (end > 0) {
            // arr[0] is the largest value in heap - swap to move it to front
            // and decrement end
            ArrayUtils.swap(arr, end--, 0);

            // the swap ruined heap property
            siftDown(arr, 0, end);
        }

    }

    /**
     * sort
     *
     * sort an array. this is an in place algorithm
     * @param arr
     * @return
     */
    public T[] sort(T[] arr) {
        sortHelper(arr);
        return arr;
    }

}
