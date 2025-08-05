/* WAP to input a string and convert into following
 * Input: " PRAMILA MEMORIAL INSTITUTE"
 * Output: "P.M.I."
*/

import java.util.*;
class Short
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        int i;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.trim();
        s=" "+s;
        int len=s.length();
        for (i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch == ' ')
            w = w + s.charAt(i+1) + ".";
        }
        System.out.println("The initials are "+w);
    }
}