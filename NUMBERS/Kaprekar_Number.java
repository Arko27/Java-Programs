import java.util.*;

class Kaprekar_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n2, c = 0, sq, pow;
        n2 = n;
        sq = n * n;
        if (n < 0)
            System.out.println("INVALID INPUT. Please enter a positive number");
        else {
            while (n > 0) {
                n = n / 10;
                c++;
            }
            pow = (int) Math.pow(10, c);
            if (sq % pow + sq / pow == n2)
                System.out.println(n2 + " is a Kaprekar Number");
            else
                System.out.println(n2 + " is not a Kaprekar Number");
        }
    }
}