package SORTING;

import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, t, key;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 1; i < n; ++i) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        System.out.println("The Sorted Array is: " + Arrays.toString(a));
    }
}