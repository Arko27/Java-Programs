/* WAP a menu-driven Program to accept a String and print whether it is Palindrome or Special according to user's Choice.
 * 
 * Input:
 * Choose b/w the two: Enter 1 for Palindrome and 2 for Special Word.
 * Choice: 2
 * Enter the Word: "COMIC"
 * 
 * 1st letter: s.charAt(0)
 * Last letter: s.charAt(len-1)
 * 
 * Output: Yes the word is Special.
 */
import java.util.*;
class Palin_Sp
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int c;
        System.out.println("Enter a String");
        s = sc.nextLine();
        int len = s.length();
        System.out.println("Enter 1 for Palindrome and 2 for Special");
        System.out.println("Enter Your Choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1:
            char ch;
            String w="";
            int i;
            for(i=0;i<len;i++)
            {
                ch = s.charAt(i);
                if(ch!=' ')
                w = ch + w;
            }
            if(w.equalsIgnoreCase(s) == true)
            System.out.println("It is Palindrome");
            else
            System.out.println("It is not Palindrome");
            break;
            
            case 2:
            char a,b;
            a = s.charAt(0);
            b = s.charAt(len-1);
            if(a == b)
            System.out.println("It is Special");
            else
            System.out.println("It is not Special");
            break;
            
            default:
            System.out.println("Wring Choice");
        }
    }
}