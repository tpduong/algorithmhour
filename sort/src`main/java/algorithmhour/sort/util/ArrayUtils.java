package algorithmhour.sort.util;

/**
 * ArrayUtils
 *
 * some array utility functions that are useful
 */
public class ArrayUtils {

    public static <T> void swap(T[] arr, int i , int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
