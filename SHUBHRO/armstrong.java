import java.util.*;
class armstrong
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,a,v,c=0,b,k,p;
        System.out.println("Enter a number");
        n=sc.nextInt();
        v=n;
        while(n>0)
        {
            a=n%10;
            c++;
            n=n/10;
        }
        p=v;
        while(v>0)
        {
            b=v%10;
            k=(int)Math.pow(b,c);
            s=s+k;
            v=v/10;
        }
        if(p==s)
        System.out.println("ARMSTRONG NUMBER");
        else
        System.out.println("NOT ARMSTRONG");
    }
}