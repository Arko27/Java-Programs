import java.util.*;
class Amstrong
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,p,rem=0,c=0,a,s=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        p=n;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            c++;
        }
        a=p;
        while(p>0)
        {
            rem=p%10;
            s=s+(int)(Math.pow(rem,c));
            p=p/10;
        }
        if(s==a)
        System.out.println("it is an amstrong number");
        else
        System.out.println("it is not an amstrong number");
    }
}