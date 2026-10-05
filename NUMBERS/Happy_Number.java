import java.util.*;

class Happy_Number {
    public static int sumSqDigits(int x) {
        if (x == 0)
            return 0;
        else {
            int d = x % 10;
            return (d * d + sumSqDigits(x / 10));
        }
    }

    public static void isHappy(int n) {
        int a = sumSqDigits(n);
        while (a > 9) {
            a = sumSqDigits(a);
        }
        if (a == 1)
            System.out.println(n + " is a Happy Number");
        else
            System.out.println(n + " is not a Happy Number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        isHappy(n);
    }
}