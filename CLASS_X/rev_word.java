/* WAP to input a Name and print in the following format:
 * Input: "Aakash Kumar Gupta"
 * Output: "Gupta Kumar Aakash"
 */
import java.util.*;
class rev_word
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",n="";
        int i,j;
        char ch;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s = s.trim();
        s = s +" ";
        int len = s.length();
        for (i=0;i<len;i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
            w = w + ch;
            else
            {
                n = w +" "+ n;
                w="";
            }
        }
        System.out.println("The new Stirng: "+n);
    }
}