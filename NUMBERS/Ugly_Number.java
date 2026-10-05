import java.util.*;

class Ugly_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer greater than 0");
        int n = sc.nextInt();
        int k = n;
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0)
                n /= 5;
            else if (n % 3 == 0)
                n /= 3;
            else if (n % 2 == 0)
                n /= 2;
            else {
                System.out.print(n + " is not an Ugly Number");
                x = 1;
                break;
            }
        }
        if (x == 0)
            System.out.print(k + " is an Ugly Number");
    }
}