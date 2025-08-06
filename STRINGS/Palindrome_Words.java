import java.util.*;
class Palindrome_Words
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Palindrome_Words obj = new Palindrome_Words();
        
        System.out.println("Enter the Sentence: ");
        String s = sc.nextLine();
        s = s.trim();
        s = s + " ";
        int i;
        char ch;
        String word = "";
        
        System.out.println("The Palindromic Words are:");
        for(i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch!= ' ')
                word = word + ch;
            else
            {
                if(obj.palin(word) == 1)
                    System.out.println(word);
                word = "";
            }            
        }
    }
    
    int palin(String word)
    {
        int i;
        char ch;
        String revWord = "";
        for(i = 0; i < word.length(); i++)
        {
            ch = word.charAt(i);
            revWord = ch + revWord;
        }
        
        if(word.equalsIgnoreCase(revWord))
        return 1;
        else
        return 0;
    }
}