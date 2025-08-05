import java.util.*;
class Nth_Prime
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int num=1,i,c=0;
        while(c<n)
        {
            num=num+1;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                break;
            }
            if(i==num)
            c++;
        }
        System.out.println("The value of Nth Prime no. is "+num);
    }
}