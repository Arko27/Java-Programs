package Java;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] a = { 5, 2, 3, 1, 4 };
        int n = a.length;
        int i, j, t;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j + 1] < a[j]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }            
        }
        System.out.println(Arrays.toString(a));
    }
}
