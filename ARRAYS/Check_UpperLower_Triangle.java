import java.util.*;

class Check_UpperLower_Triangle {

    public static void check_Upper_Triangle(int arr[][], int n) {
        int i, j;
        boolean flag = false;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i > j) {
                    if (arr[i][j] != 0)
                        flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("It is not a Upper Triangular Matrix");
        else
            System.out.println("It is a Upper Triangular Matrix");
    }

    public static void check_Lower_Triangle(int arr[][], int n) {
        int i, j;
        boolean flag = false;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j > i) {
                    if (arr[i][j] != 0)
                        flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("It is not a Lower Triangular Matrix");
        else
            System.out.println("It is a Lower Triangular Matrix");
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

        System.out.println("1. Enter 1 to check for Lower Triangular Matrix");
        System.out.println("2. Enter 2 to check for Upper Triangular Matrix");
        int ch = sc.nextInt();

        if (ch == 1)
            check_Lower_Triangle(a, n);
        else if (ch == 2)
            check_Upper_Triangle(a, n);
        else
            System.out.println("Wrong Choice");
    }
}