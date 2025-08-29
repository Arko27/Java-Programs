package Java;
import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {

        int[] a = { 5, 2, 3, 1, 4 };
        int n = a.length;
        int i, j, t;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                } else
                    break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
