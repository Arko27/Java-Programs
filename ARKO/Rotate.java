import java.util.*;
class Rotate
{
    void main()
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the square matrix");
        int n=sc.nextInt();
        if(n>2 && n<20)
        {
            int a[][]=new int[n][n];
            int p[][]=new int[n][n];
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
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                p[i][j]=a[j][i];
            }
        }
        System.out.println("The 90 degree rotated matrix is");
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j--)
            {
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }
    }
    else
    System.out.println("The value of n is incorrect");
}
}