import java.util.*;
public class transposeArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int tr[][] = new int[n][n];
        int i,j;
        
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        }
        
        System.out.println("The Original Array is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        
        tr = transpose(a,n);
        System.out.println("The Transposed Array is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(tr[i][j]+"\t");
            System.out.println();
        }
    }
    
    static int[][] transpose(int[][] arr, int n)
    {
        int b[][] = new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                b[i][j] = arr[j][i];
        }
        return b;
    }
}