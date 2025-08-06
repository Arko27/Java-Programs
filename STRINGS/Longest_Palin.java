import java.util.*;
class Longest_Palin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        s = s + " ";
        int i, max = 0, l;
        String r = "", w = "", wrd = "";
        char ch;
        int len = s.length();
        for (i = 0; i < len; i++)
        {
            ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
                r = ch + r;
            }
            else
            {
                l = w.length();
                if ((w.equalsIgnoreCase(r)) && (l > max))
                {
                    max = l;
                    wrd = w;
                }
                w = "";
                r = "";
                l = 0;
            }
        }
        System.out.println("\nThe Longest Palindromic Word is " + wrd);
    }
}