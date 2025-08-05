import java.util.*;
class IMEI//490154203237518
{
    int sumDig(int n)
    {
        int a=0;
        while(n>0)
        {
            a=a+n%10;
            n=n/10;
        }
        return a;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 15-digit IMEI Code:");
        long n=sc.nextInt();
        String s=Long.toString(n);
        int l=s.length();
        int d=0,sum=0;
        if(l!=15)
        System.out.println("Output:Invalid Input");
        else
        {
            for(int i=l;i>=1;i--)
            {
                d=(int)n%10;
                if(i%2==0)
                d=2*d;
                sum=sum+sumDig(d);
                n=n/10;
            }
            System.out.println("Output:Sum= "+sum);
            if(sum%10==0)
            System.out.println("Valid IMEI No.");
            else
            System.out.println("Not valid IMEI No.");
        }
    }
}   