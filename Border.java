import java.util.*;
class Border
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
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
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
             {
                 if(i==0 || j==0 || i==n-1 || j==n-1)
                 System.out.print(a[i][j]+"\t");
                 else
                 System.out.print(" "+"\t");
                }
                System.out.println();
            }
        }
    }