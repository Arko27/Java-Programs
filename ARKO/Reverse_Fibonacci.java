import java.util.*;
class Reverse_Fibonacci
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        a[0]=0;
        a[1]=1;
        for(i=2;i<n;i++)
        {
            a[i]=a[i-2]+a[i-1];
        }
        System.out.println("The Fibonacci series in reverse order is");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+"\t");
        }
    }
}