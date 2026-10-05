import java.util.*;

class Magic_Number {

    public static int sumOfDigits(int x) {
        if (x == 0)
            return 0;
        else {
            int d = x % 10;
            return (d + sumOfDigits(x / 10));
        }
    }

    public static void isMagic(int n) {
        int a = n;
        while (a > 9) {
            a = sumOfDigits(a);
        }
        if (a == 1)
            System.out.println(n + " is a Magic Number");
        else
            System.out.println(n + " is not a Magic Number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        isMagic(n);
    }
}