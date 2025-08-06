import java.util.*;

public class Alpha_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String a[] = new String[n];
        int i, j;
        String tmp = "";
        System.out.println("Enter the array elements");

        for (i = 0; i < n; i++)
            a[i] = sc.nextLine();

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println("The sorted array is");
        for (i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}