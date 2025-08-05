import java.util.*;
class Kaprekar_No
{
    public static boolean isKaprekar(int n)
    {
        if (n == 1)
            return true;
            
        int sq = n * n;
        int count = 0;
        int i, div, sum;
        while (sq != 0)
        {
            count++;
            sq = sq / 10;
        }
        
        sq = n*n;
        for (i = 1; i < count; i++)
        {
            div = (int) Math.pow(10, i);
            if (div == n)
                continue;

            sum = sq/div + sq % div;
            if (sum == n)
                return true;
        }
    
        return false;
    }
    
    public static void main (String args[])
    { 
        int i;
        System.out.println("The Kaprekar numbers between 1 and 100 are: ");
        for(i = 1;i <= 100; i++)
        {
            if(isKaprekar(i))
            System.out.println(i);
        }
    }
} 