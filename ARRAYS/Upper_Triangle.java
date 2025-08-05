import java.util.*;
class Upper_Triangle
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n,i,j;
        n = sc.nextInt();
        int a[][] = new int [n][n];
        
        System.out.println("Enter the array");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("the original matrix is");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("the upper triangle is");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if (j>i)
                    System.out.print(a[i][j]+"\t"); 
                else 
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}