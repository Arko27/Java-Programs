import java.util.*;

class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int a = 0, b = 1, c = 0;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series is: \n");
        System.out.print(a + " " + b + " ");
        for (i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}