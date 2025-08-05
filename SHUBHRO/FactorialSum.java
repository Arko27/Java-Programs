import java.util.*;
class FactorialSum
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,n,s=0,f=1;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        { 
            f=f*i;
            s=s+f;
        }
        System.out.println("Sum of factorial ="+s);
    }
}