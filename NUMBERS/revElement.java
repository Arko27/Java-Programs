import java.util.*;
class revElement
{
    int reverse(int n)
    {
        int rem,rev=0;
        while(n>0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;        
    }
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m=sc.nextInt();
        System.out.println("Enter the no of columns");
        int n=sc.nextInt();
        int i,j;
        int a[][]=new int[m][n];
        
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The original Matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                a[i][j] = reverse(a[i][j]);
        }
        
        System.out.println("The new Matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}