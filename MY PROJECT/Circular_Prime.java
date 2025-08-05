import java.util.*;
class Circular_Prime
{
    static int Prime(int num)
    {
        int i, c = 0;     
        for (i = 1; i <= num; i++)
        {
            if (num % i == 0)
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
        int i, c = 0, rem, n, t1, t2, flag = 1, n2, num1;
        System.out.println("Enter the Number : ");
        n = sc.nextInt();
        n2 = n;
        num1 = n;   

        if (n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        
        if (Prime(n) == 1)
        {
            while(n2 > 0)
            {
                rem = n2 % 10;
                c++;
                n2 = n2 / 10;
            }
            n2 = n;
            int divisor = (int)(Math.pow(10, c - 1));
            System.out.println(n);
            for (i = 1; i < c; i++)
            {
                t1 = n2 / divisor;
                t2 = n2 % divisor;
                n2 = t2 * 10 + t1;

                System.out.println(n2);

                if (Prime(n2) == 0)
                {
                    flag = 0;
                    break;
                }
            }
        }
        else
            flag = 0;
        
        if (flag == 1)
            System.out.println(num1 + " is a Circular Prime");
        else
            System.out.println(num1 + " is not a Circular Prime");
    }
}