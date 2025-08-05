import java.util.*;
class Nearest_Prime
{
    boolean isPrime(int x)
    {
        int i,c = 0;
        for(i = 1;i <= x;i++)
        {
            if(x%i == 0)
            c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int i,d1 = 0,d2 = 0;
        if(n == 1)
            System.out.println("Nearst Pirme to 1 is 2");
        else if(n == 2)
            System.out.println("Nearst Pirme to 2 is 3");
        else
        {
            Nearest_Prime obj = new Nearest_Prime();
            for(i = n+1;;i++)
            {
                if(obj.isPrime(i))
                {
                    d1 = i;
                    break;
                }   
            }
            
            for(i = n-1;;i--)
            {
                if(obj.isPrime(i))
                {
                    d2 = i;
                    break;
                }
            }
            System.out.println("The Nearest Prime nos. are "+d2+" and "+d1);
        }
    }
}