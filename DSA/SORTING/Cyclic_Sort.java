package SORTING;

import java.util.*;

public class Cyclic_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, t, idx;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            while (a[i] != i + 1) {
                idx = a[i] - 1;
                t = a[i];
                a[i] = a[idx];
                a[idx] = t;
            }
        }
        System.out.println("The Sorted Array is: " + Arrays.toString(a));
    }
}