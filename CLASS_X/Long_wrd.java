/* WAP to input a string and print the longest wrrd from it
 * 
 * Input: "Tata Football academy will play against Mohan Bagan"
 * 
 * Output: Longest Word: Football
 *         Length: 8
 */

import java.util.*;
class Long_wrd
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String");
        s=sc.nextLine();
        s.trim();
        s=s+" ";
        String lw="",w="";
        char ch;
        int len=s.length();
        int i;
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w = w+ch;
            else
            {
                if(w.length()>lw.length())
                    lw = w;
                w="";
            }
        }
        System.out.println("Longest Word: "+lw);
        System.out.println("Length: "+lw.length());
    }
}              