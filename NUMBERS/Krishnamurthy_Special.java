import java.util.*;
class Krishnamurthy_Special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,i,f=1,l=0,v;
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        v=n;
        while(n>0)
        {
            a=n%10;
            f=1;
            for(i=1;i<=a;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(v==s)
        System.out.println("KRISHNAMURTHY NUMBER");
        else
        System.out.println("NOT KRISHNAMURTHY NUMBER");
    }
}