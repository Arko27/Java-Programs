import java.util.*;
class majik_composite
{
    static int composite(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>2)
        return(1);
        else
        return(0);
    }
    static int magic(int n)
    {
        int a, s = 0;
        while(n>9)
        {
            s = 0;
            while(n>0)
            {
                a=n%10;
                s=s+(a*a);
                n=n/10;
            }
            n=s;
        }
        if(n == 1)
        return 1;
        else
        return 0;
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("ENTER LOWER LIMIT OF THE RANGE");
            int a=sc.nextInt();
            System.out.println("ENTER UPPER LIMIT OF THE RANGE");
            int b=sc.nextInt();
            int i;
            System.out.println("MAGIC COMPOSITE NUMBERS ARE:");
            for(i=a;i<=b;i++)
            {
                int l=magic(i);
                int k=composite(i);
                if(l==1 && k==1)
                System.out.println(i);
            }
    }
}