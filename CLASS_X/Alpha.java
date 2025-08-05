/* WAP to input a String in and print the String in Alphabetical Order.
 * Input: "COMPUTER"
 * Output: "CEMOPRTU"
 */

import java.util.*;
class Alpha
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int i,j,p;
        char ch;
        s = s.trim();
        int len = s.length();
        System.out.println("The String in Alphabetical Order is: ");
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                ch = s.charAt(j);
                if(ch == (char)i || ch == (char)(i+32))
                System.out.print(ch);
            }
        }
    }
}