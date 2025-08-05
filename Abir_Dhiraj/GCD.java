import java.util.*;

class GCD
{
    void main()
    {
        Scanner sc  = new Scanner(System.in);
        int rem, a, b;
        System.out.println("Enter the 1st No.");
        a = sc.nextInt();
        System.out.println("Enter the 2nd No.");
        b = sc.nextInt();
        
        if(a>b)
        {
            while(b > 0)
            {
                rem = a%b;
                a = b;
                b = rem;
            }
            System.out.println("GCD = "+a);
        }
        
        else
        {
            while(a > 0)
            {
                rem = b%a;
                b = a;
                a = rem;
            }
            System.out.println("GCD = "+b);
        }
    }
}