import java.util.*;

class Factors {
    public static void main(String args[]) {
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}