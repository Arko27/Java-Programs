import java.util.*;

class Prime_Factor {
    public static int isPrime(int n) {
        int i, c = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return 1;
        else
            return 0;
    }

    public static void primeFactor(int n) {
        int f = 2;
        while (n > 1) {
            if (n % f == 0) {
                System.out.print(f + " ");
                n /= f;
            } else {
                f++;
                while (isPrime(f) != 1)
                    f++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        primeFactor(n);
    }
}