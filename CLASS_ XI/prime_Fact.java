import java.util.*;
class prime_Fact
{
    int prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
            
    void factor(int n)
    {
        int f=2;
        while(n>1)
        {
            if(n%f==0)
            {
                System.out.print(f+" ");
                n/=f;
            }
            else
            {
                f++;
                while(prime(f)!=1)
                f++;
            }
        }
    }
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        factor(n);
    }
}