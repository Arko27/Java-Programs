import java.util.*;
class Krishnamurthy_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,s=0,i,f=1,v;
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
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
            System.out.println(v + " is a Krishnamurthy Number");
        else
            System.out.println(v + " is not a Krishnamurthy Number");
    }
}