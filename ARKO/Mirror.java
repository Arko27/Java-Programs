import java.util.*;
class Mirror
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original Matrix array is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The Mirror Matrix is: ");
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j--)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}