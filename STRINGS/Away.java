import java.util.*;
class Away
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        char ch,ch1;
        int len,i;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s = s+" ";
        s = s.toLowerCase();
        len = s.length();
        for(i = 0; i < len - 1; i++)
        {
            ch = s.charAt(i);
            ch1 = s.charAt(i + 1);
            if(ch != ch1)
            w = w + ch;
        }
        System.out.println("\nThe new String by removing repeated alphabets is:\n" + w);
    }
}