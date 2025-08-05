import java.util.*;
class nterms_switch
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,ch;
        System.out.println("enter 1 for series 1 and 2 for series 2");
        ch=sc.nextInt();
        System.out.println("Enter n");
        n=sc.nextInt();
        switch(ch)
        {
            case 1:
            int i;
            double s=0.0;
            for(i=1;i<=n;i++)
            {
                s=1/i*2;
            }
            System.out.println(s);
            break;
            
            case 2:
            int a , d=0,f=1;
            for(a=1;a<=n;a++)
            {
                f=f*a;
                d=d+f;
            }
            System.out.println(d);
            break;
            
            default:
            System.out.println("WRONG CHOICE !!");
        }
    }
}