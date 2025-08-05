import java.util.*;
class Disarium_No//135
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int copy=n,d=0,sum=0;
        String s=Integer.toString(n);
        int len=s.length();
        while(copy>0)
        {
            d=copy%10;
            sum=sum+(int)Math.pow(d,len);
            len--;
            copy=copy/10;
        }
        if(sum==n)
        System.out.println(n+" is Disarium Number");
        else
        System.out.println(n+" is not Disarium Number");
    }
}