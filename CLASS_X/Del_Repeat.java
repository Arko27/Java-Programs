/* WAP to input a word and delete the repeated letters and print the new word.
 * 
 * Input: "Jaaavvvaa"
 * Output: "Java"
 */
import java.util.*;
class Del_Repeat
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        char ch,ch1;
        int len,i,c=0;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s=s+" ";
        len = s.length();
        for(i=0;i<len-1;i++)
        {
            ch = s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch!=ch1)
            w = w+ch;
        }
        System.out.println(w);
    }
}