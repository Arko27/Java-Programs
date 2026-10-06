import java.util.*;

class Display_UpperLower_Triangle {

    public static void display_Upper_Triangle(int arr[][], int n) {
        int i, j;
        System.out.println("The Upper Triangular Matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || j > i)
                    System.out.print(arr[i][j] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void display_Lower_Triangle(int arr[][], int n) {
        int i, j;
        System.out.println("The Lower Triangular Matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || i > j)
                    System.out.print(arr[i][j] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Square Matrix");
        int n, i, j;
        n = sc.nextInt();
        int a[][] = new int[n][n];

        System.out.println("Enter the Matrix elements:");
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

        display_Lower_Triangle(a, n);
        display_Upper_Triangle(a, n);
    }
}