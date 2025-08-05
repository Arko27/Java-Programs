import java.util.*;
class Orthogonal
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the square matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the array elements");
        int i,j,s=0,s1=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                s=s+a[i][j];
                if(i+j==n-1)
                s1=s1+a[i][j];
            }
        }
        if(s==s1)
        System.out.println("The matrix is Orthogonal");
        else
        System.out.println("The Matrix is not Orthogonal");
    }
}