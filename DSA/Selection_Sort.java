package Java;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] a = { 5, 2, 3, 1, 4 };
        int n = a.length;
        int i, j, t, pos;

        for (i = 0; i < n - 1; i++) {
            pos = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] > a[pos])
                    pos = j;
            }
            t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
        System.out.println(Arrays.toString(a));
    }
}
