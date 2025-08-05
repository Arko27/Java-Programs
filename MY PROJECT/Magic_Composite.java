import java.util.*;
class Magic_Composite
{
    int Magic(int a)
    {
        int c,s=0;
        while(a>9)
        {
            s=0;
            while(a>0)
            {
                c=a%10;
                s=s+c;
                a=a/10;
            }
            a=s;
        }
        if(s==1)
        return 1;
        else
        return 0;
    }
    int Composite(int b)
    {
        int i,c1=0;
        for(i=1;i<=b;i++)
        {
            if(b%i==0)
            c1++;
        }
        if(c1>=2)
        return 1;
        else
        return 0;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower Range");
        int lr=sc.nextInt();
        System.out.println("Enter the Upper Range");        
        int ur=sc.nextInt();
        int j,k1,k2;
        Magic_Composite obj=new Magic_Composite();
        if(lr>10 && ur<500)
        {
            for(j=lr;j<=ur;j++)
            {
              k1=obj.Magic(j);
              k2=obj.Composite(j);
              if((k1==1) && (k2==1))
              System.out.println(j+" is a Magic Composite no.");
            }
        }
        else
        {
            System.out.println("Lower Range cannot be less than 10");
            System.out.print(" And Upper Range cannot be more than 500");
        }
    }
}