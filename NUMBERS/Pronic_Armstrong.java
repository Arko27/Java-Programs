import java.util.*;
class Pronic_Armstrong
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c;
        System.out.println("Enter 1 for Pronic No and 2 Armstrong No.");
        System.out.println("Enter Your Choice");
        c=sc.nextInt();
        System.out.println ("Enter any number");
        n=sc.nextInt();    
        switch(c)
        {
            case 1:
            int f=0;
            for(i=1;i<=n;i++)
            {
                if(n == i*(i+1))
                {
                    f=1;
                    break;
                }
            }
            if (f==1)
            System.out.println("It is a pronic number");
            else 
            System.out.println("It is not a pronic number");
            break;
            
            case 2:
            int sum=0,r;
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
            break;
            
            default:
            System.out.println("Wrong choice");
        }
    }
}  