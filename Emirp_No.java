import java.util.*;
class Emirp_No
{
    int isPrime(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    int reverse(int n)
    {
        int c,r=0;
        while(n>0)
        {
            c=n%10;
            r=r*10+c;
            n=n/10;
        }
        return r;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int no=sc.nextInt();
        int a=reverse(no);
        int p=isPrime(a);
        int q=isPrime(no);
        if((p==1) && (q==1))
        System.out.println(no+" is an Emirp No.");
        else
        System.out.println(no+" is not an Emirp No.");
    }
}