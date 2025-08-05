import java.util.*;
class Array_PosNeg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[15];
        int P[] = new int[15];
        int N[] = new int[15];
        int i,p = 0, n = 0;

        System.out.println("Enter the array elements:");
        for(i = 0; i < 15; i++)
            A[i] = sc.nextInt();
        
        System.out.println("The array elements are:");
        for(i = 0; i < 15; i++)
            System.out.println(A[i]);
        
        for(i = 0; i < 15; i++)
        {
            if(A[i] >= 0)
                P[p++] = A[i];
            else
                N[n++] = A[i];
        }

        System.out.println("\nThe Positive array elemnets are: ");
        for(i = 0; i< p; i++)
            System.out.print(P[i] + " ");
        
        System.out.println("\nThe Negative array elemnets are: ");
        for(i = 0; i< n; i++)
            System.out.print(N[i] + " ");

    }
}