import java.util.*;
class Smith_No
{
    int sumDig(int n)
    {
        int c,s=0;
        while(n>0)
        {
            c=n%10;
            s=s+c;
            n=n/10;
        }
        return s;
    }
    int PrimeFactsum(int n)
    {
        int i=2,sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i);
                n=n/i;
            }
            else
            i++;
        }
        return sum;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        Smith_No obj=new Smith_No();
        int a=obj.sumDig(n);
        int b=obj.PrimeFactsum(n);
        if(a==b)
        System.out.println("The no. is smith no.");
        else
        System.out.println("The no. is not smith no.");
    }
}