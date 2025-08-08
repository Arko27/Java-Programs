import java.util.*;

public class Magic_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of magical square: ");
        int n, c, r = 1, num;
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        if (n % 2 == 0)
            System.out.println("Magic Square is not Possible for even dimensions");
        else {
            c = n / 2 - 1;
            for (num = 1; num <= n * n; num++) {
                r--;
                c++;
                if (r == -1)
                    r = n - 1;
                if (c > n - 1)
                    c = 0;
                if (arr[r][c] != 0) {
                    r = r + 2;
                    c--;
                }
                arr[r][c] = num;
                if (r == 0 && c == 0) {
                    r = n - 1;
                    c = 1;
                    arr[r][c] = ++num;
                }
                if (c == n - 1 && r == 0)
                    arr[++r][c] = ++num;
            }
            System.out.println();
            for (r = 0; r < n; r++) {
                for (c = 0; c < n; c++)
                    System.out.print(arr[r][c] + " ");
                System.out.println();
            }
        }
    }
}