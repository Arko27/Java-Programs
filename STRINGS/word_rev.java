/*WAP to input a string and convert in the following way:

 * Input: "We study in school"
 * Output: "eW yduts ni loohcs"*/
 
import java.util.*;
class word_rev
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",r="";
        int i;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.trim();
        s=s + " ";
        int len=s.length();
        for (i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if (ch!=' ')
            r = ch + r;
            else
            {
                w = w + " "+r;
                r="";
            }
        }
        System.out.println("The new String is: "+w);
    }
}