package algorithmhour.sort.util;

/**
 * CompareUtils
 *
 * some comparison utilities to make things fun
 */
public class CompareUtils {

    public static <T extends Comparable<? super T>> boolean eq(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static <T extends Comparable<? super T>> boolean gte(T a, T b) {
        return a.compareTo(b) >= 0;
    }

    public static <T extends Comparable<? super T>> boolean gt(T a, T b) {
        return a.compareTo(b) > 0;
    }

    public static <T extends Comparable<? super T>> boolean lt(T a, T b) {
        return a.compareTo(b) < 0;
    }

    public static <T extends Comparable<? super T>> boolean lte(T a, T b) {
        return a.compareTo(b) <= 0;
    }

}
