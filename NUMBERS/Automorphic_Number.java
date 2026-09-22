import java.util.*;

class Automorphic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, c = 0, sq, last;
        System.out.println("Enter a Number");
        n = sc.nextInt();
        a = n;

        while (n > 0) {
            c++;
            n = n / 10;
        }

        sq = a * a;
        last = sq % ((int) Math.pow(10, c));

        if (a == last)
            System.out.println(a + "is an Automorphic Number");
        else
            System.out.println(a + "is not an Automorphic Number");
    }
}