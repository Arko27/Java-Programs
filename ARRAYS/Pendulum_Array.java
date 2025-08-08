import java.util.*;

public class Pendulum_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i, j;
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("The sorted array is");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int mid = (n - 1) / 2;
        int x = 1, lim = n - 1 - mid;
        b[mid] = a[0];
        for (i = 1; i <= lim; i++) {
            if ((mid + i) < n)
                b[mid + i] = a[x++];
            if ((mid - i) >= 0)
                b[mid - i] = a[x++];
        }
        System.out.println("The pendulum array is");
        for (i = 0; i < n; i++) {
            System.out.print(b[i] + "\t");
        }
    }
}