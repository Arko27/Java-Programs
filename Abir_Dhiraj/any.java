import java.util.*;
class any
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,a,r=0 ,rem,sq,laast;
        System.out.println ("enter the number");
        n=sc.nextInt();
        a=n;
        while(n>0)
        {
            rem=n%10;
            r=r+1;
            n=n/10;
        }
        sq=a*a;
        laast=sq% ((int)Math.pow(10,r));
        if (a==laast)
        System.out.println("automorphic num");
        else
        System.out.println ("not a automorphic num");
    }
}
    