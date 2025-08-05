import java.util.*;
class Circular_Prime
{
    int prime(int n)
    {
        int c=0,s;
        for(s=1;s<=n;s++)                                           
        {
            if(n%s==0)
            c++;
        }
        if(c==2)
        return 1;
        else 
        return 0;
    }
    int circulate(int n)
    {
        String s=Integer.toString(n);
        String p=s.substring(1)+s.charAt(0);
        int a=Integer.parseInt(p);
        return a;
    }
    void isCircularPrime(int n)
    {
        int f=0,a=n;
        do
        {
            System.out.println(a);
            if(prime(a)==0)
            {
                f=1;
                break;
            }
            a=circulate(a);
        }
        while(a!=n);
        if(f==1)
        System.out.println(n+" is not a circualr prime no.");
        else
        System.out.println(n+" is a circualr prime no.");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Circular_Prime obj=new Circular_Prime();
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        obj.isCircularPrime(n);
    }
}