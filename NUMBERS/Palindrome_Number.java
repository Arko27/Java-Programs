import java.util.*;

class Palindrome_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = 0, rev = 0;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (a == rev)
            System.out.println(a + " is a Palindrome Number");
        else
            System.out.println(a + " is not a Palindrome Number");
    }
}