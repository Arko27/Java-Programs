import java.util.*;

class Sum_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int s[][] = new int[n][n];
        int i, j;
        System.out.println("Enter the array elements for Matrix a");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Matrix A is\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the array elements for Matrix B");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Matrix B is\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The Sum of the Matrices is \n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}