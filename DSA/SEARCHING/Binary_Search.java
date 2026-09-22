package SEARCHING;

import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, l, u, m = 0;
        boolean flag = false;
        l = 0;
        u = n - 1;
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the searched no.");
        int n1 = sc.nextInt();
        while (l <= u) {
            m = l + (u - l) / 2;
            if (n1 > a[m])
                l = m + 1;
            else if (n1 < a[m])
                u = m - 1;
            else {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(n1 + " is present in " + (m + 1) + " position");
        else
            System.out.println("Search Unsuccessful");
    }
}