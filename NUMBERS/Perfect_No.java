import java.util.*;
class Perfect_No//6
{
    int num;
    Perfect_No(int nn)
    {
        num=nn;
    }
    int sum_of_factors(int i)
    {
        int s=0;
        if(i==num)
        return s;
        if(num%i==0)
        {
            s=s+i;
            sum_of_factors(i+1);            
        }
        return s;
    }
    void check()
    {
        if(num==(sum_of_factors(num)))
        System.out.println("The no. is a perfect no.");
        else
        System.out.println("The no. is a not perfect no.");
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        Perfect_No obj=new Perfect_No(n);
        obj.sum_of_factors(n);
        obj.check();
    }
}