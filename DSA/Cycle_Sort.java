package Java;
import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] a = { 5, 2, 3, 1, 4 };
        int n = a.length;
        int i, t,idx;
        for (i = 0; i < n; i++) {
            while (a[i] != i + 1) {
                idx = a[i] - 1;
                t = a[i];
                a[i] = a[idx];
                a[idx] = t;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
