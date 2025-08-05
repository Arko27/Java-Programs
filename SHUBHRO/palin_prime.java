import java.util.*;
class palin_prime
{
    static int prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return(1);
        else
        return(0);
    }
    static int palin(int n)
    {
        int i,a,s=0,v;
        v=n;
        while(n>0)
        {
           a=n%10;
           s=s*10+a;
           n=n/10;
        }
        if(v==s)
        return(1);
        else
        return(0);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER LOWER LIMIT OF THE RANGE");
        int a=sc.nextInt();
        System.out.println("ENTER UPPER LIMIT OF THE RANGE");
        int b=sc.nextInt();
        int i;
        for(i=a;i<=b;i++)
        {
            int l=palin(i);
            int k=prime(i);
            if(l==1 && k==1)
            System.out.println("NUMBERS ARE :"+i);
        }
    }
}
