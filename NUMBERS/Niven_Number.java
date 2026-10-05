import java.util.*;

class Niven_Number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, a, v, s = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        v = n;
        while (n > 0) {
            a = n % 10;
            s = s + a;
            n = n / 10;

        }
        if (v % s == 0)
            System.out.println(v + "is a Niven Number");
        else
            System.out.println(v + "is not a Niven Number");
    }
}