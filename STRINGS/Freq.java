/* 1. WAP to input a Sentence and also a Word (w) and check how many times w is present in the sentence
 * 
 * Input: 
 * Sentence: "Hello how are you ? you are good. What are you doing ?"
 * Word: "you"
 * 
 * Output: 3
 */
import java.util.*;
class Freq
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",wrd;
        char ch;
        int len,i,c=0;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s=s.trim();
        s = s+" ";
        len = s.length();
        System.out.println("Enter the word to be counted");
        wrd = sc.nextLine();
        for(i=0;i<len;i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
            w = w+ch;
            else
            {
                if(w.equalsIgnoreCase(wrd) == true)
                c++;
                w="";
            }
        }
        System.out.println("The frequency of word is "+c);
    }
}