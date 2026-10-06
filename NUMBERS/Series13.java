import java.util.*;

class Series13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, f = 1, s = 0;
        System.out.println("S = 1! + 2! + 3! + 4! + ............ to n terms");
        System.out.println("Enter the value of n");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            f = f * i;
            s = s + f;
        }
        System.out.println("The Sum of the Series is: " + s);
    }
}