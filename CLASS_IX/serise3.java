import java.util.*;
class serise3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        double a,i,s=0;
        System.out.println("Enter the value");
        a=sc.nextDouble();
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            s=s-a/i;
            else
            s=s+a/i;
        }
        System.out.println("the sum is="+s);
    }
}

   