package SORTING;

import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, t, pos;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < n - 1; i++) {
            pos = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[pos])
                    pos = j;
            }
            t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
        System.out.println("The Sorted Array is: " + Arrays.toString(a));
    }
}
