import java.util.*;
class EvenOdd_PrimeComp
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int c;
        System.out.println("1.Even or odd,2. Prime or composite");
        System.out.println("Enter your choice");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            int n;
            System.out.println("Enter the num");
            n=sc.nextInt();
            if(n%2==0)
            System.out.println("the num is even");
            else
            System.out.println("The num is odd");
            break;
            
            case 2:
            int co=0,i;
            System.out.println("Enter the num");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                co++;
            }
            if(co==2)
            System.out.println("It is a prime number");
            else
            System.out.println("It is a composite number");
            break;
            
            default:
            System.out.println(" Wrong choice");
        }
    }
}