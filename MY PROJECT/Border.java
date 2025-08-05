import java.util.*;
class Border
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int i,j;
        
        System.out.println("Enter the array elements");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The original Matrix is:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("The matrix with border elements is:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                  if(i == 0 || j == 0 || i == m - 1 || j == n - 1)
                  System.out.print(a[i][j] + "\t");
                  else
                  System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }
}