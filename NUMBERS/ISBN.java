/* Input : 007462542X
Output : Valid
007462542X = 10*0 + 9*0 + 8*7 + 7*4 + 6*6 + 5*2 + 4*5 + 3*4 + 2*2 + 1*10 = 176
Since 55 leaves no remainder when divided 
by 11, hence it is a valid ISBN.*/

import java.util.*;
class ISBN
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String n;
        char ch;
        int i,s=0,dig,pos=10;
        System.out.println("Enter the no");
        n=sc.nextLine();
        n.trim();
        int len = n.length();
        if(len == 10)
        {
            for(i=0;i<9;i++)
            {
                ch=n.charAt(i);
                dig = (int)ch - '0';
                if(dig>=0 && dig<=9)
                {
                    s = s + pos*dig;
                    pos--;
                }
                else
                {
                    System.out.println("The No is Invalid");
                    break;
                }
            }
            ch=n.charAt(9);
            if(ch == 'X')
                s = s + 10;
            else if(ch != 'X')
            {
                if((int)ch>=48 && (int)ch<=57)
                {
                    dig = (int)ch - '0';
                    s =s+dig;
                }
                else
                    System.out.println("The No is Invalid");
            }
            
            if(s%11==0)
            System.out.println("The No is Valid");
            else
            System.out.println("The No is Invalid");
        }
        else
        System.out.println("The No is Invalid");
    }
}