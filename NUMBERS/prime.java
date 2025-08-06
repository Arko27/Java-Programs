import java.util.*;
class prime
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("It is a prime number");
        else
        System.out.println("It is a composite number");
    }
}