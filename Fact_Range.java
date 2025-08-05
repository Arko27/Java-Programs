import java.util.*;
class Fact_Range
{
    int fact(int num)
    {
        if(num==0)
        return 1;
        return(num*fact(num-1));
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper and lower range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,f=0;
        for(i=a;i<=b;i++)
        {
            f=fact(i);
            System.out.println("The factorial of "+i+" is "+f);
        }
    }
}