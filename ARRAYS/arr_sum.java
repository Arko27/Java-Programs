import java.util.*;

public class Arr_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, s = 0;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the datas:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            s = s + a[i];
        }
        System.out.println("The sum is " + s);
    }
}