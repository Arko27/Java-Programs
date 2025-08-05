import java.util.*;
class String_Format
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Sentence: ");
        String s = sc.nextLine();
        
        int i;
        char ch;
        String s1 = "";
        for(i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && Character.isDigit(ch) != true)
                s1 = s1 + ch;
        }
        
        System.out.println("The New String is: "+ s1);
    }
}