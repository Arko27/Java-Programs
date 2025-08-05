import java.util.*;
public class transposedArray
{
    static int i,j,n;
    static int arr[][], trans[][];
    
    static void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        arr = new int[n][n];
        trans = new int[n][n];
        
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }
    }
    
    static void display(int[][] a)
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
    
    static void transpose()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                trans[i][j] = arr[j][i];
        }
    }
    
    public static void main(String args[])
    {
        transposedArray obj = new transposedArray();
        obj.fillArray();
        System.out.println("The Original Array is: ");
        obj.display(arr);
        obj.transpose();
        System.out.println("The Transposed Array is: ");
        obj.display(trans);
    }
}