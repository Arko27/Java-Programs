import java.util.*;
class Ugly_No//1,2,3,6,5,20
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer greater than 0");
        int n=sc.nextInt();
        int k=n;
        if(n<=0)
        System.out.println("Input a correct number");
        int x=0;
        while(n != 1)
        {
            if(n%5==0)
            n/=5;
            else if(n%3==0)
            n/=3;
            else if(n%2==0)
            n/=2;
            else
            {
                System.out.print("It is not an ugly number.");
                x=1;
                break;
            }
        }
        if(x==0)
        System.out.print(k+" is an ugly number.");
    }
}