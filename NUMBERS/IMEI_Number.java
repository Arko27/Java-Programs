import java.util.*;

class IMEI_Number {
    
    public static int sumDig(int n) {
        int a = 0;
        while (n > 0) {
            a = a + n % 10;
            n = n / 10;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 15-digit IMEI Code:");
        long n = sc.nextInt();
        String s = Long.toString(n);
        int l = s.length();
        int d = 0, sum = 0;
        long no = n;
        if (l != 15)
            System.out.println("Invalid Input");

        else {
            for (int i = l; i >= 1; i--) {
                d = (int) n % 10;
                if (i % 2 == 0)
                    d = 2 * d;
                sum = sum + sumDig(d);
                n = n / 10;
            }

            System.out.println("Sum = " + sum);
            if (sum % 10 == 0)
                System.out.println(no + " is a valid IMEI Number");
            else
                System.out.println(no + " is not a valid IMEI Number");
        }
    }
}