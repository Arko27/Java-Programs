import java.util.*;

class Amstrong_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, p, rem = 0, c = 0, a, s = 0;
        System.out.println("Enter a Number");
        n = sc.nextInt();
        p = n;

        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            c++;
        }

        a = p;

        while (p > 0) {
            rem = p % 10;
            s = s + (int) (Math.pow(rem, c));
            p = p / 10;
        }

        if (s == a)
            System.out.println(s + " is an Armstrong Number");
        else
            System.out.println(s + "is not an Armstrong Number");
    }
}