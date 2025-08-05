//WAP to enter a number and check whether it is Buzz or Palindrome according to user's Choice.

import java.util.*;
class Buzz_Palindrome
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter \n1. Buzz No.\n2. Palindrome No.");
        System.out.println("Enter Your Choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            int n;
            System.out.println("Enter a No.:");
            n = sc.nextInt();
            if(n%7 == 0 || n%10 == 7)
                System.out.println("It is a Buzz No.");
            else
                System.out.println("It is not a Buzz No.");
            break;
            
            case 2:
            int m,c,r=0,m1;
            System.out.println("Enter a No.:");
            m = sc.nextInt();
            m1 = m;
            while(m>0)
            {
                c = m%10;
                r = r*10 + c;
                m = m/10;
            }
            if(r == m1)
                System.out.println("It is a Palindrome No.");
            else
                System.out.println("It is not a Palindrome No.");            
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}   