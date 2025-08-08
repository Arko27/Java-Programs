import java.util.*;

public class MergeDelDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k = 0, tmp;

        System.out.println("Enter the size of the First Array");
        int m = sc.nextInt();
        int a[] = new int[m];

        System.out.println("Enter the elemnets of the first array");
        for (i = 0; i < m; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter the size of the Second Array");
        int n = sc.nextInt();
        int b[] = new int[n];

        System.out.println("Enter the elemnets of the second array");
        for (i = 0; i < n; i++)
            b[i] = sc.nextInt();

        int mergedArray[] = new int[m + n + 1];
        mergedArray[m + n] = 9999; // for descending sorting: mergedArray[0] = 9999;

        for (i = 0; i < m; i++)
            mergedArray[k++] = a[i];

        for (i = 0; i < n; i++)
            mergedArray[k++] = b[i];

        for (i = 0; i < k - 1; i++) {
            for (j = 0; j < k - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    tmp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = tmp;
                }
            }
        }

        System.out.println("The Merged Sorted Array is: ");
        for (i = 0; i < k; i++)
            System.out.println(mergedArray[i] + "\t");

        System.out.println("The Merged Sorted Array after deleting duplicte is: ");
        for (i = 0; i < k; i++) {
            if (mergedArray[i] != mergedArray[i + 1])
                System.out.println(mergedArray[i]);
        }
    }
}