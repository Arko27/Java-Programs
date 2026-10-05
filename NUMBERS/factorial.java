import java.util.*;

class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, f = 1;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++)
            f = f * i;

        System.out.println("The factorial of " + n + " is " + f);
    }
}