import java.util.*;
class Orthogonal
{
    public static int[][] matrixMul(int a[][], int m)
    {
        int i,j,k,sum;
        int trans[][] = new int[m][m];
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < m; j++)
                trans[i][j] = a[j][i];
        }
        
        int prod[][] = new int[m][m];
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < m; j++) 
            {
                sum = 0;
                for (k = 0; k < m; k++)                
                    sum = sum + (a[i][k] * a[j][k]);
                prod[i][j] = sum;
            }
        }
        
        return prod;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the square matrix");
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        System.out.println("Enter the array elements");
        int i,j,flag=1;
        
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            a[i][j] = sc.nextInt();
        }
        
        System.out.println("The Matrix is");
        for(i = 0;i < m; i++)
        {
            for(j = 0; j < m; j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        
        int prod[][] = matrixMul(a,m);
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < m; j++) 
            {
                if ((i == j && prod[i][j] != 1) || (i != j && prod[i][j] != 0))
                    flag = 0;
            }
        }
        
        if(flag == 1)
            System.out.println("The Matrix is Orthogonal");
        else
            System.out.println("The Matrix is not Orthogonal");
    }
}