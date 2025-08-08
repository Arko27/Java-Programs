import java.util.*;

public class Matrix_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Matrix: ");
        int n = sc.nextInt();

        if (n > 3 && n < 10) {

            int a[][] = new int[n][n];
            int i, j, s = 0;

            System.out.println("Enter the Matrix Elements: ");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("The Original Matrix is:");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }

            int b[] = new int[(n - 2) * (n - 2)];
            int k = 0;
            for (i = 1; i < n - 1; i++) {
                for (j = 1; j < n - 1; j++) {
                    b[k++] = a[i][j];
                }
            }

            for (i = 0; i < k - 1; i++) {
                for (j = 0; j < k - i - 1; j++) {
                    if (b[j] > b[j + 1]) {
                        int t = b[j];
                        b[j] = b[j + 1];
                        b[j + 1] = t;
                    }
                }
            }

            k = 0;
            for (i = 1; i < n - 1; i++) {
                for (j = 1; j < n - 1; j++) {
                    a[i][j] = b[k++];
                }
            }

            System.out.println("The Rearranged Matrix is :");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("The Diagonal Matrix is:");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (i == j) {
                        s = s + a[i][j];
                        System.out.print(a[i][j] + "\t");
                    } else if ((i + j) == n - 1) {
                        s = s + a[i][j];
                        System.out.print(a[i][j] + "\t");
                    } else
                        System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println("Sum of the Diagonal Elements is : " + s);
        }

        else
            System.out.println("Invalid Input");
    }
}