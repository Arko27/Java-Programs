import java.util.*;
class Symmetric
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,f=0;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        int transpose[][] = new int[n][n];
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
                transpose[j][i] = a[i][j];
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((a[i][j] != transpose[i][j]))
                {
                    f = 1;
                    break;
                }                
            }
        }
        
        if(f == 1)
            System.out.println("The Matrix is not Symmetric");
        else
            System.out.println("The Matrix is Symmetric");
    }
}