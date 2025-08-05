import java.util.*;
class Symmetric
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,p=0,f=1;
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
                if(a[i][j]!=a[j][i])
                {
                    f=0;
                    break;
                }
            }
        }
        if(f==1)
        System.out.println("The matrix is symmetric");
        else
        System.out.println("The matrix is Non-symmetric");        
    }
}