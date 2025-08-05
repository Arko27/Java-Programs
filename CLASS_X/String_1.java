/* 1. WAP to input a String and print in the followng format
 * 
 * Input: " i read in class ten"
 * Output: "I Read In Class Ten"
 */
import java.util.*;
class String_1
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,s1="";
        int i,len;
        char ch,ch1;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s=s.trim();
        s=" "+s;
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch = s.charAt(i);
            if(ch == ' ')
            {
                ch1 = s.charAt(i+1);
                s1 = s1 + ' ' + Character.toUpperCase(ch1);
                i=i+1;
            }
            else
                s1 = s1+ch;
        }
        System.out.println(s1);
    }
}