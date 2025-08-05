import java.util.*;
class Armstrong
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,r;
        
        System.out.println("Enter any number");
        n=sc.nextInt();
        int a=n;
        while(n>0)
        {
          r=n%10;
          sum=sum+r*r*r;
          n=n/10;
        }
        if(a==sum)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong");
    }
}
        
    
        
        
 