import java.util.*;
class GoldBatchNo
{
    int Prime(int n)
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
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n1=sc.nextInt();
        int i,j,p=0;
        if(n1%2==0)
        {
            for(i=1;i<(n1/2);i++)
            {
                if((Prime(i)==1 && Prime(n1-i)==1))
                {
                    System.out.println("i= "+i+" and n1-i= "+(n1-i));
                }
            }
            /*System.out.println(n1+" is a Gold Batch No.");
            else
            System.out.println(n1+" is not a Gold Batch No.");
        }
        else
        System.out.println("Enter an even no. to be checked");*/
    }
}
}