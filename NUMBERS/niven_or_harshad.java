import java.util.*;
class niven_or_harshad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,v,p=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        v=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            p=p+a;
        }
        if(v%p==0)
        System.out.println("NIVEN NUMBER");
        else
        System.out.println("NOT NIVEN NUMBER");
    }
}