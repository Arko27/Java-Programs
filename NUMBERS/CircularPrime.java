import java.util.*;
class CircularPrime
{
    boolean isPrime(int n)
    {
        int c=0;
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else 
        return false;
    }
    
    int Circulate(int n)
    {
        String s=Integer.toString(n);
        String p=s.substring(1)+s.charAt(0);
        int a=Integer.parseInt(p);
        return a;
    }
    
    void isCircularPrime(int n)
    {
        int f=0,a1=n;
        do
        {
            System.out.println(a1);
            if(isPrime(a1)==false)
            {
                f=1;
                break;
            }
            a1=Circulate(a1);
        }
        while(a1!=n);
        if(f==1)
        System.out.println(n+" Is not a circular prime");
        else
        System.out.println(n+" Is a circular prime");
    }
    public static void main(String args[])
    {
        CircularPrime obj=new CircularPrime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        obj.isCircularPrime(n);
    }
}