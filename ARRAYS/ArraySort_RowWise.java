import java.util.*;

public class ArraySort_RowWise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of M: ");
        int m = sc.nextInt();
        System.out.print("Enter the Value of N: ");
        int n = sc.nextInt();

        if (m <= 2 || m >= 10 || n <= 2 || n >= 10) {
            System.out.println("Matrix Size out of Range.");
            return;
        }

        int a[][] = new int[m][n];
        System.out.println("Enter the Elements of the Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        System.out.println("The Original Matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int t = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = t;
                    }
                }
            }
        }

        System.out.println("Matrix after Sorting the Rows: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}