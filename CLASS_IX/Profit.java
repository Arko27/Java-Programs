import java.util.*;
class Profit
{
    void main ()
    {
        Scanner sc=new Scanner (System.in);
        double sp,cp,p,l,e,r;
        System.out.println("enter the sp");
        sp=sc.nextDouble();
        System.out.println("enter the cp");
        cp=sc.nextDouble();
        if(sp>cp)
        {
            p=sp-cp;
            e=p/cp*100;
            System.out.println("The profit is="+p);
            System.out.println("the profit percent is="+e);
        }
        else if(cp>sp)
        {
            l=cp-sp;
            r=l/cp*100;
            System.out.println("The loss is="+l);
            System.out.println("The loss percent is="+r);
        }
        else 
        System.out.println("neither profit nor loss");
    }
}
        
        
    