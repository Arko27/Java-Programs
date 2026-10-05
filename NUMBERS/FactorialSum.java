import java.util.*;

class Factorial_Sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, s = 0, f = 1;
        System.out.println("Enter the vlue of n");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            f = f * i;
            s = s + f;
        }

        System.out.println("Sum of Factorial = " + s);
    }
}