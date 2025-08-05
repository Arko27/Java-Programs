import java.util.*;
public class MirrorArray
{
    static int i,j,n;
    static int arr[][], mirr[][];
    
    static void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        arr = new int[n][n];
        mirr = new int[n][n];
        
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
    
    static void mirror()
    {
        for(i=0;i<n;i++)
        {
            int k=0;
            for(j=n-1;j>=0;j--)
                mirr[i][j] = arr[i][k++];
        }
    }
    
    public static void main(String args[])
    {
        MirrorArray obj = new MirrorArray();
        obj.fillArray();
        System.out.println("The Original Array is: ");
        obj.display(arr);
        obj.mirror();
        System.out.println("The Mirror Array is: ");
        obj.display(mirr);
    }
}