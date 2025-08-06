import java.util.*;
class RightLeft_CircularShift
{
    public static void right_shift(int[] a, int n)
    {
        int i, temp = a[n-1];
        for(i = n-1; i >= 1; i--)
            a[i] = a[i-1];
            
        a[0] = temp;
    }
    
    public static void left_shift(int[] a, int n)
    {
        int i, temp = a[0];
        for(i = 0; i < n-1; i++)
            a[i] = a[i+1];
            
        a[n-1] = temp;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows of the matrix");
        int m = sc.nextInt();
        System.out.println("Enter the no of columns of the matrix");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int i,j;
        
        System.out.println("Enter the array elements");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }    
        
        System.out.println("The original Matrix is: ");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        
        for(i = 0; i < m; i++)
        {
            if(i % 2 == 0)
                right_shift(a[i],n);
            else
                left_shift(a[i],n);
        }
        
        System.out.println("The Matrix after Circular Shift is: ");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}