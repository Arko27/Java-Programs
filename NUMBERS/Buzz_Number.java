import java.util.*;

class Buzz_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n % 10 == 7 || n % 7 == 0)
            System.out.println(n + "is a Buzz Number");
        else
            System.out.println(n + "is not a Buzz Number");
    }
}