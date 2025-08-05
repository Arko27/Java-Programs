import java.util.*;
class Pal_Prime
{
    int Palin(int a)
    {
        int c,s=0,a1=a;
        while(a>0)
        {
            c=a%10;
            s=s*10+c;
            a=a/10;
        }
        if(s==a1)
        return 1;
        else
        return 0;
    }
    int Prime(int b)
    {
        int i,c1=0;
        for(i=1;i<=b;i++)
        {
            if(b%i==0)
            c1++;
        }
        if(c1==2)
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
        Pal_Prime obj=new Pal_Prime();
        if(lr>10 && ur<500)
        {
            for(j=lr;j<=ur;j++)
            {
              k1=obj.Palin(j);
              k2=obj.Prime(j);
              if((k1==1) && (k2==1))
              System.out.println(j+" is a PalPrime no.");
              else
              System.out.println(j+" is not a PalPrime no.");
            }
        }
        else
        {
            System.out.println("Lower Range cannot be less than 10");
            System.out.print("And Upper Range cannot be more than 500");
        }
    }
}