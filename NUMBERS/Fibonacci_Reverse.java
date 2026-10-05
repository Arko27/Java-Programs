import java.util.*;

class Fibonacci_Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        a[0] = 0;
        a[1] = 1;
        for (i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        System.out.println("The Fibonacci Series in reverse order: ");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + "\t");
        }
    }
}