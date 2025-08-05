/* WAP to enter a sentence and print only the Palindrome Words using functions.
 * 
 * main() --> takes input of the sentence.
 * int palin(String word) --> take word as the parameter and returns 1 if palindrome.
 */

import java.util.*;
class Palin_Word
{
    int Palin(String word)
    {
        int i,len;
        char ch;
        String word2="";
        len = word.length();
        for(i=0;i<len;i++) //for(i=len-1;i>=0;i--)
        {
            ch=word.charAt(i);
            if(ch!=' ')
            word2 = ch+word2;//word2 = word2+ch
        }
        if(word.equalsIgnoreCase(word2)==true)
        return 1;
        else
        return 0;
    }
    
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the String");
        str=sc.nextLine();
        str.trim();
        str=str+" ";
        String word="";
        char ch;
        int l=str.length();
        int i,p;
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            word = word+ch;
            else
            {
                p = Palin(word);
                if(p==1)                    
                System.out.println(word);
                word="";
            }
        }
    }
}