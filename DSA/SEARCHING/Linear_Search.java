package SEARCHING;

import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, srch;
        boolean flag = false;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the value to be searched");
        srch = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == srch) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Search Successful");
        else
            System.out.println("Search Unsuccessful");
    }
}