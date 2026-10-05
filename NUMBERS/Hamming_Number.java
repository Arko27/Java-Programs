import java.util.Scanner;

public class Hamming_Number {

    public static boolean isHamming(int n) {
        if (n == 1)
            return true;

        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("INVALID INPUT. Please enter a positive integer.");
        } else {

            if (isHamming(num)) {
                System.out.println(num + " is a Hamming Number");
            } else {
                System.out.println(num + " is not a Hamming Number");
            }
        }
    }
}