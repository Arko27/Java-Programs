import java.util.*;
class prime
{
    int check (int n)
    {
        int i,c=0;
        for (i=1;i<=n;i++)
        {
            if (n%i==0)
            c++;
        }
        if (c==2)
        return(1);
        else
        return(0);
    }
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        prime obj = new prime();
        int r=obj.check(n);
        if (r==1)
        System.out.println("PRIME");
        else
        System.out.println(" NOT PRIME");
    }
}