import java.util.*;
class Transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = 4,i,j;
        int a[][] = new int[m][m];
        System.out.println("Enter the array elements");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Original Matrix is");
        for(i = 0; i < m; i++)
        {
            for(j = 0;j < m; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nThe Transposed Matrix is");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }
}