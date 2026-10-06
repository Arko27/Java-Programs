import java.util.*;

class Array_PosNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int A[] = new int[size];
        int P[] = new int[size];
        int N[] = new int[size];
        int i, p = 0, n = 0;

        System.out.println("Enter the array elements:");
        for (i = 0; i < size; i++)
            A[i] = sc.nextInt();

        for (i = 0; i < 15; i++) {
            if (A[i] >= 0)
                P[p++] = A[i];
            else
                N[n++] = A[i];
        }

        System.out.println("The Positive array elemnets are: ");
        for (i = 0; i < p; i++)
            System.out.print(P[i] + " ");

        System.out.println("The Negative array elemnets are: ");
        for (i = 0; i < n; i++)
            System.out.print(N[i] + " ");
    }
}