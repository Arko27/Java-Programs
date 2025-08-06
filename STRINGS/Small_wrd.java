/* WAP to input a string and print the longest wrrd from it
 * 
 * Input: "Tata Football academy wil play against Mohan Bagan"
 * 
 * Output: Longest Word: wil
 *         Length: 3
 */

import java.util.*;
class Small_wrd
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String");
        s=sc.nextLine();
        s.trim();
        s=s+" ";
        String sw=s,w="";
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
                if(w.length()<sw.length())
                    sw = w;
                w="";
            }
        }
        System.out.println("Smallest Word: "+sw);
        System.out.println("Length: "+sw.length());
    }
}              