import java.util.*;
class Fill_Prime
{
    boolean prime(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }
        return (c == 2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Fill_Prime obj = new Fill_Prime();
        System.out.println("Enter the value of n to make the matrix:");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int c = 0, i = 0, j = 0;
        while(c < n*n)
        {
            System.out.println("Enter the number:");
            int no = sc.nextInt();
            if(obj.prime(no))
            {
                a[i][j++] = no;
                c++;
            }
            if(j == n)
            {
                i++;
                j = 0;
            }
        }
        System.out.println("The Matrix filled with prime numbers is: ");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}