import java.util.*;
class hcf_lcm
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int h=0,l,i,a,b;
        System.out.println("enter the no.");
        a=sc.nextInt();
        System.out.println("enter the 2nd no.");
        b=sc.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            h=i;
        }
        l=(a*b)/h;
        System.out.println("the hcf="+h);
        System.out.println("the lcm="+l);
    }
}
    
