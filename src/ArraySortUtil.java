import java.util.Collection;
import java.util.List;

/**
 * Created by Hayk on 23.07.2021.
 */
public class ArraySortUtil {
    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        for (int i = 1; i < list.size(); ++i) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    private static <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
        T pi = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pi) < 1) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);

        return i + 1;
    }

    private static <T> void swap(List<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static <T extends Comparable> void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }
}
