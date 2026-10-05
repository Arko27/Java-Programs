import java.util.*;

class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = 0, l, i;
        System.out.println("Enter two nos.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                h = i;
        }

        l = (a * b) / h;
        System.out.println("HCF = " + h);
        System.out.println("LCM = " + l);
    }
}