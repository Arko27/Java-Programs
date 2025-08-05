import java.util.*;
class hcf_lcm
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,h=0,l,i;
        System.out.println("Enter two nos.");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i == 0 && b%i == 0)
                h=i;
        }
        l=(a*b)/h;
        System.out.println("Hcf= "+h);
        System.out.println("Lcm= "+l);
    }
}