import java.util.*;
class Composite_Magic
{
    public static int magic(int n)
    {
        int s, rem, sum;
        while(n > 9)
        {            
            sum = 0;
            while(n > 0)
            {
                rem = n % 10;
                sum = sum + rem;
                n = n/10;
            }
            n = sum;
        }
        
        if(n == 1)
        return 1;
        else
        return 0;
    }
    
    public static int composite(int n)
    {
        int i, c = 0;
        for(i = 1;i <= n;i++)
        {
            if(n%i == 0)
            c++;
        }
        if(c > 2)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the lower range");
        int lr = sc.nextInt();
        System.out.println("Enter the upper range");
        int ur = sc.nextInt();
        
        if(lr < ur)
        {
            System.out.println("The Magic Composite numbers are: ");
            for(i = lr; i <= ur;i++)
            {
                if(magic(i) == 1 && composite(i) == 1)
                System.out.println(i);
            }
        }
        else
        System.out.println("Invalid Input");
    }
}