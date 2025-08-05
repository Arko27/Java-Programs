import java.util.*;
class prime
{
    void main ()
    {
        Scanner sc=new Scanner (System.in);
        int a,c=0,i;
        System.out.println("enter the number");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c==2)
        System.out.println("it is a prime number");
        else
        System.out.println("it is not a prime number");
    }
}
