import java.util.*;
class Dec2Bin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n, c=0,i=0,r;
        int ar[]=new int[20];
        System.out.println("Enter");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%2;
            ar[i]=r;
            n=n/2;
            i++;
            c++;
        }
        
        for (i=c-1;i>=0;i--)
        {
            System.out.print(ar[i]);
        }
    }
}