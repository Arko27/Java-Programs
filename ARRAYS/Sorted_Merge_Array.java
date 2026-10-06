import java.util.*;

public class Sorted_Merge_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n, i, j, k = 0, s, tmp;
        System.out.println("Enter the size of First Array");
        m = sc.nextInt();
        System.out.println("Enter the size of Second Array");
        n = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        s = m + n;
        int c[] = new int[s];

        System.out.println("Enter elements in the First Array:");
        for (i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements in the Second Array:");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (i = m; i < s; i++) {
            c[i] = b[k++];
            // k++;
        }

        System.out.println("The Merged Array is:");
        for (i = 0; i < s; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        for (i = 0; i < s; i++) {
            for (j = 0; j < s - 1; j++) {
                if (c[j] > c[j + 1]) {
                    tmp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nThe Sorted Merge Array is:");
        for (i = 0; i < s; i++) {
            System.out.print(c[i] + " ");
        }
    }
}