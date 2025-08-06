import java.util.*;
class Smith
{
    int sumDig(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    int sumPrimeFact(int n)
    {
        int i=2,sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i);
                n=n/i;
            }
            else
            i++;
        }
        return sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Smith obj=new Smith();
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=obj.sumDig(n);
        int b=obj.sumPrimeFact(n);
        System.out.println("Sum of Digits="+a);
        System.out.println("Sum of prime factors="+b);
        if(a==b)
        System.out.println("It is a smith number");
        else
        System.out.println("It is not a smith number");
    }
}