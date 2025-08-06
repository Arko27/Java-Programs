import java.util.*;
class Occurence_Digits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Long Number");
        long n = sc.nextLong();
        int i, c = 0, rem = 0;
        System.out.println("Occurence of Digits in the Number is:");
        for(i = 0; i <= 9; i++)
        {
            long n1 = n;
            while(n1 > 0)
            {
                rem = (int)(n1 % 10);
                if(rem == i)
                    c++;
                n1 = n1 / 10;
            }
            if(c > 0)
                System.out.println(i+" - "+c);
            c = 0;
        }        
    }
}