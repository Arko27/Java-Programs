import java.util.*;
class Reverse_ArrEle
{
    int reverse(int n)
    {
        int rem, rev = 0;
        while(n > 0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Reverse_ArrEle obj = new Reverse_ArrEle();
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int i, j;
        System.out.println("Enter the Array Elements:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("The Matrix is:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println("The New Matrix is:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(obj.reverse(a[i][j])+"\t");
            System.out.println();
        }        
    }
}