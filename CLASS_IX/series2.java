import java.util.*;
class series2
{
    void main ()
    {
        Scanner sc=new Scanner (System.in);
        int n,i,f=1;
        double s=0;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
            s=s+f;
        }
        System.out.println("the sum is ="+s);
    }
}
