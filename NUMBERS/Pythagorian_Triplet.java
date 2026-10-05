import java.util.*;

class Pythagorian_Triplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to check for Pythagorian Triplet:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a * a == b * b + c * c) || (b * b == c * c + a * a) || (c * c == b * b + a * a))
            System.out.print("They form a Pythagorian Triplet");
        else
            System.out.print("They do not form a Pythagorian Triplet");
    }
}