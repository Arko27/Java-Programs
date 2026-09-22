import java.util.*;

class Bouncy_Number {
    int decreasing(int n) {
        int i, f = 0;
        char ch;
        String s = Integer.toString(n);
        for (i = 0; i < s.length() - 1; i++) {
            ch = s.charAt(i);
            if (ch < s.charAt(i + 1)) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return 0;
        else
            return 1;
    }

    int increasing(int n) {
        int i, f = 0;
        char ch;
        String s = Integer.toString(n);
        for (i = 0; i < s.length() - 1; i++) {
            ch = s.charAt(i);
            if (ch > s.charAt(i + 1)) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bouncy_Number bouncy_Number = new Bouncy_Number();
        System.out.println("Enter a no.");
        int n1 = sc.nextInt();
        if (bouncy_Number.decreasing(n1) == 1)
            System.out.println("The no. is Decreasing");
        else if (bouncy_Number.increasing(n1) == 1)
            System.out.println("The no. is Increasing");
        else
            System.out.println("The no. is Bouncy");
    }
}