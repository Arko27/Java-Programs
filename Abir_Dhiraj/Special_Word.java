import java.util.*;
class Special_Word
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Special_Word obj = new Special_Word();
        
        System.out.println("Enter the Word: ");
        String w = sc.nextLine();
        
        int i;
        char ch;
        
        if(obj.palin(w) == 0)
        {
            if(w.charAt(0) == w.charAt(w.length()-1))
                System.out.println("It is a Special Word");
            else
                System.out.println("It is not a Special Word");
        }
        else
            System.out.println("It is not a Special Word");
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