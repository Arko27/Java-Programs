import java.util.*;
class GoldBatchNo
{
    static int Prime(int n)
    {
        int i,p=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            p++;
        }
        if(p==2)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive even no.");
        int n1=sc.nextInt();
        int i;        
        if(n1%2==0 && n1>0)
        {
            if((Prime(n1/2)==1))
            {
                System.out.println("i= "+(n1/2)+" and n1-i= "+(n1/2));
                for(i=1;i<(n1/2);i++)
                {
                    if((Prime(i)==1 && Prime(n1-i)==1))
                    System.out.println("i= "+i+" and n1-i= "+(n1-i));
                }   
            }
        }
        else
        System.out.println("INVALID INPUT");
    }
}