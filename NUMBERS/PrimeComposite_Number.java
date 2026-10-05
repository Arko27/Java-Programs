import java.util.*;

class PrimeComposite_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, c = 0;
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is a Composite Number");
    }
}