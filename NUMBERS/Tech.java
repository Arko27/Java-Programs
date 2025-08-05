import java.util.*;
class Tech
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,r,a,b,copy;
        System.out.println("Enter a no");
        n=sc.nextInt();
        copy=n;
        while(n>0)
        {
            r=n%10;
            c++;
            n/=10;
        }
        if(c%2==0)
        {            
            a=copy/(int)(Math.pow(10,c/2));
            b=copy%(int)(Math.pow(10,c/2));
            
            if(copy == Math.pow(a+b,2))
            System.out.println("Tech Number");
            else
            System.out.println("Not a Tech Number");            
        }
        else
            System.out.println("Invalid Input");
    }
}