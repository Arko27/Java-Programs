import java.util.*;

public class IIDtoID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int k = 0, i, j, p = 0;
        System.out.println("Enter the elemnts in IID Array");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("The 2D Array is");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        p = n * n;
        int b[] = new int[p];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[k] = a[i][j];
                k++;
            }
        }
        System.out.println("The conversion from 2D to 1D Array is---->");
        for (i = 0; i < p; i++)
            System.out.print(b[i] + "\t");
    }
}