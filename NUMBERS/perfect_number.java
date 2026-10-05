import java.util.*;

class Perfect_Number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int s = 0, i;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (i = 1; i < n; i++) {
            if (n % i == 0)
                s = s + i;
        }
        if (s == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is not a Perfect Number");
    }
}