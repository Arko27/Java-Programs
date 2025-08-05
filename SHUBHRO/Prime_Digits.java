import java.util.*;
class Prime_Digits
{
    int prime(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
            if(n% i == 0)
                c++;
        }
        
        if(c == 2)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        Prime_Digits obj = new Prime_Digits();
        int n = sc.nextInt();
        int rem;
        while(n > 0)
        {
            rem = n % 10;
            if(obj.prime(rem) == 1)
                System.out.println(rem);
            n = n / 10;
        }
    }
}