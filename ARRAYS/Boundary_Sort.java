import java.util.*;

public class Boundary_Sort {
    public static void main(String args[]) {
        int m, n = 0, pos = 0, temp = 0, sum = 0, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        m = sc.nextInt();
        int ar[][] = new int[m][m];
        n = (m + m - 2) * 2;
        int t[] = new int[n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
                if (i == 0 || j == 0 || i == m - 1 || j == m - 1) {
                    sum = sum + ar[i][j];
                    t[pos] = ar[i][j];
                    pos++;
                }
            }
        }

        System.out.println("The Matrix is");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++)
                System.out.print(ar[i][j] + "\t");
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (t[j] > t[j + 1]) {
                    temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }

        pos = 0;
        for (i = 0; i < m; i++, pos++)
            ar[0][i] = t[pos];

        for (i = 1; i < m - 1; i++, pos++)
            ar[i][m - 1] = t[pos];
        for (i = m - 1; i >= 0; i--, pos++)
            ar[m - 1][i] = t[pos];

        for (i = m - 2; i > 0; i--, pos++)
            ar[i][0] = t[pos];

        System.out.println("The Matrix after sorting boundary elements is");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++)
                System.out.print(ar[i][j] + "\t");
            System.out.println();
        }
        System.out.println("The sum of boundary elements: " + sum);
    }
}