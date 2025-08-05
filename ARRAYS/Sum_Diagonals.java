import java.util.*;
class Sum_Diagonals
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
        System.out.println("The Left Diagonal is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                System.out.print(a[i][j]+"\t");
                s=s+a[i][j];
            }
            else
            System.out.print("\t");
        }
            System.out.println();
        }
        System.out.println("The sum of the left diagonal is "+s);
        System.out.println("The Right Diagonal is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if (i+j==n-1)
                {
                System.out.print(a[i][j]+"\t");                
                s1=s+a[i][j];
            }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("The sum of the right diagonal is "+s);
    }
}