import java.util.*;
import java.math.*;
class large_PrimeFactor
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        long n=sc.nextLong();
        long i,j;
        int p;
        for(i=2;i<n;i++)
        {
            p=0;
            if(n%i==0)
            {
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    p++;
                }
                if(p==2)
                System.out.println(i);
            }
        }
    }
}