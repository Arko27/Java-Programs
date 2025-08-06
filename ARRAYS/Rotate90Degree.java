import java.util.*;
class Rotate90Degree
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int m = sc.nextInt();
        System.out.println("Enter the row of the matrix");
        int n = sc.nextInt();
        int a[][]=new int[m][n];
        int b[][] = new int [n][m];
        int c[][] = new int [n][m];
        int i,j;
        System.out.println("Enter the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix is");
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
            {
                b[j][i] = a[i][j];
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                c[i][j] = b[i][m-1-j];
            }
        }
        
        System.out.println("The Rotated Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}